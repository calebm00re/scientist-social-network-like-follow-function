package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Notifications extends Model {

    @Constraints.Required
    @ManyToMany(mappedBy = "User")
    public Long user_id;

    @Id
    @ManyToMany(mappedBy = "User")
    public Long document_id;

    public static Model.Find<Long, Notifications> find = new Model.Find<Long, Notifications>(){};


    //list of Notifications
    public static List<Notifications> list() {
        return Notifications.find
                .where()
                .findList();
    }

    public static List<Notifications> findById(Long user_id) {
        return Notifications.find
                .where()
                .eq("user_id", user_id)
                .findList();
    }

    public static Notifications findNotificationbyId(Long document_id) {
        return Notifications.find
                .where()
                .eq("document_id", document_id)
                .eq("user_id", 1)
                .findUnique();
    }

}
