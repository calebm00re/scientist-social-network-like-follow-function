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

    // Add a like
    public Result addLike(Long document_id) {

        Likes like = new Likes();
        like.document_id = document_id;
        like.user_id = 1L;
        like.save();
        return ok(Json.toJson(like));
    }

//    public Result unfollow() {
//        System.out.println("Unfollow a user");
//        JsonNode req = request().body().asJson();
//        User src = User.findById(req.get("user_id").asLong());
//        User oth = User.findById(req.get("other_id").asLong());
//
//        if (src != null && oth != null) {
//            Follow f = Follow.findByUsers(src.user_id, oth.user_id);
//            if (f != null) {
//                System.out.println("Can unfollow");
//                f.delete();
//                return ok("true");
//            }
//        }
//        return ok("false");
//    }

    public Result unlike(Long document_id) {
        Likes l = Likes.findLikeByDoc(document_id);
        System.out.println(l);
        if (l != null) {
            l.delete();
            return ok("true");
        }
        return ok("false");
    }}
