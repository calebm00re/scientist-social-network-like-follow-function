package models;

import com.avaje.ebean.Model;

import javax.persistence.Id;
import java.util.List;

public class Likes {

    @Id
    private int id;

    public static Model.Find<Long, Likes> find = new Model.Find<Long, Likes>(){};

    //list of likes
    public static List<Likes> getLikes() {
        return find.all();
    }

}
