package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Follows;
import models.Likes;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class FollowsController extends Controller {

    public Result getFollows() {
        System.out.println("Getting follows");
        List<Follows> follows = Follows.list();
        return ok(Json.toJson(follows));
    }

    public Result getFollowsbyId(Long user_id) {
        System.out.println("Getting Follows By User");
        List<Follows> follows = Follows.findById(user_id);
        return ok(Json.toJson(follows));
    }

    // Add a like
    public Result addFollow(Long document_id) {

        Follows follow = new Follows();
        follow.document_id = document_id;
        follow.user_id = 1L;
        follow.save();
        return ok(Json.toJson(follow));
    }


    public Result unfollow(Long document_id) {
        Follows f = Follows.findFollowByDoc(document_id);
        System.out.println(f);
        if (f != null) {
            f.delete();
            return ok("true");
        }
        return ok("false");
    }}
