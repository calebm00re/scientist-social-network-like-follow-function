package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.print.Doc;
import java.util.List;

@Entity
public class Document extends Model {
    //private static final long serialVersionUID = 1L;

    @Id
    public Long document_id;

    @Constraints.Required
    public String title;

    @Constraints.Required
    public String author;

    @Constraints.Required
    public String text;

    public static Model.Find<Long, Document> find = new Model.Find<Long, Document>(){};


//
//    public static Document findById(Long id) {
//        return find.byId(id);
//    }

    public static Document findById(Long document_id) {
        return Document.find
                .where()
                .eq("document_id", document_id)
                .findUnique();
    }

    public static List<Document> list() {
        return Document.find
                .where()
                .findList();
    }

}
