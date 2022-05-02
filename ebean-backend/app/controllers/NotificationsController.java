package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Likes;
import models.Notifications;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class NotificationsController extends Controller{
    public Result getNotifications() {
        System.out.println("Getting notifications");
        List<Notifications> noti = Notifications.list();
        return ok(Json.toJson(noti));
    }

    public Result getNotificationsbyId(Long user_id) {
        System.out.println("Getting notifications");
        List<Notifications> noti = Notifications.findById(user_id);
        return ok(Json.toJson(noti));
    }

    // Turn on Notification
    public Result turnonNotifications(Long document_id) {
        Notifications noti = new Notifications();
        noti.document_id = document_id;
        noti.user_id = 1L;
        noti.save();
        return ok(Json.toJson(noti));
    }

    public Result turnoffNotifications(Long document_id) {
        Notifications n = Notifications.findNotificationbyId(document_id);
        System.out.println(n);
        if (n != null) {
            n.delete();
            return ok("true");
        }
        return ok("false");
    }}

