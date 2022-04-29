package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

public class Document {

    @Id
    public Long document_id;

    @Constraints.Required
    public String title;

    @Constraints.Required
    public String author;

    @Constraints.Required
    public String text;

    public static Model.Find<Long, Document> find = new Model.Find<Long, Document>(){};

    public static List<Document> findAll() {
        return find.all();
    }

    public static Document findById(Long id) {
        return find.byId(id);
    }

}
