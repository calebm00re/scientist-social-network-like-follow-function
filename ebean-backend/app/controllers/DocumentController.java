package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Document;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;


public class DocumentController extends Controller {
    public Result addDocument() {
        Long id = 4L;
        String title = "Scientific Study and its impact on the world";
        String text = "Brief description of the study";
        String author = "Dr. John Doe";

//        System.out.println("Follow a document");
        JsonNode req = request().body().asJson();

        Document doc = new Document();

        System.out.println("New follow");
        ObjectNode result = Json.newObject();

        doc.document_id = id;
        doc.author = author;
        doc.title = title;
        doc.text = text;
        doc.save();

        result.put("document_id", doc.document_id);
        result.put("author", doc.author);
        result.put("title", doc.title);
        result.put("text", doc.text);
        return ok(result);
    }

    //getDocuments
    public Result getDocuments() {
        System.out.println("Getting Documents");
        List<Document> u = Document.list();
        System.out.println(u);
        //for loop iterating through the list
        for (Document document : u) {
            System.out.println(document.document_id +", "+ document.author+", "+ document.title+", "+ document.text);
        }
        return ok(Json.toJson(u));
    }

    //get document by id
    public Result getDocument(Long document_id) {
        System.out.println("Getting Document");
        Document u = Document.findById(document_id);
        return ok(Json.toJson(u));
    }
}
