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

    //getDocuments
    public Result getDocuments() {
        System.out.println("Getting Documents");
        List<Document> u = Document.list();
        return ok(Json.toJson(u));
    }

    //get document by id
    public Result getDocument(Long document_id) {
        System.out.println("Getting Document");
        Document u = Document.findById(document_id);
        return ok(Json.toJson(u));
    }
}
