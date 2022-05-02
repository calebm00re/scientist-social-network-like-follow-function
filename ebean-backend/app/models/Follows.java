package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Follows extends Model {

    @Constraints.Required
    @ManyToMany(mappedBy = "User")
    public Long user_id;

    @Id
    @ManyToMany(mappedBy = "User")
    public Long document_id;

    public static Model.Find<Long, Follows> find = new Model.Find<Long, Follows>(){};


    //list of follows
    public static List<Follows> list() {
        return Follows.find
                .where()
                .findList();
    }

    public static List<Follows> findById(Long user_id) {
        return Follows.find
                .where()
                .eq("user_id", user_id)
                .findList();
    }

    public static Follows findFollowByDoc(Long document_id) {
        return Follows.find
                .where()
                .eq("document_id", document_id)
                .eq("user_id", 1)
                .findUnique();
    }

}
