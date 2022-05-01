package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Likes {

    @Constraints.Required
    @ManyToMany(mappedBy = "User")
    public Long user_id;

    @Constraints.Required
    @ManyToMany(mappedBy = "User")
    public Long document_id;

    public static Model.Find<Long, Likes> find = new Model.Find<Long, Likes>(){};


    //list of likes
    public static List<Likes> list() {
        return Likes.find
                .where()
                .findList();
    }

//    public static Likes findById(Long user_id) {
//        return Likes.find
//                .where()
//                .eq("user_id", user_id)
//                .findList();
//    }

}
