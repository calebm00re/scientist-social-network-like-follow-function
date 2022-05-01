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
        System.out.println("Getting documents");
        List<Document> u = Document.list();
        return ok(Json.toJson(u));
    }


}
