package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Likes;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class LikesController extends Controller {

    public Result getLikes() {
        System.out.println("Getting users");
        List<Likes> likes = Likes.list();
        return ok(Json.toJson(likes));
    }

    public Result getLikesbyId(Long user_id) {
        System.out.println("Getting users");
        List<Likes> likes = Likes.findById(user_id);
        return ok(Json.toJson(likes));
    }
}
