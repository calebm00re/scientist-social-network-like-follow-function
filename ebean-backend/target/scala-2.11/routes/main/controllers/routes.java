
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/loganschmitt/scientist-social-network-like-follow-function/ebean-backend/conf/routes
// @DATE:Sun May 01 23:43:36 CDT 2022

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDocumentController DocumentController = new controllers.ReverseDocumentController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLikesController LikesController = new controllers.ReverseLikesController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDocumentController DocumentController = new controllers.javascript.ReverseDocumentController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLikesController LikesController = new controllers.javascript.ReverseLikesController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
  }

}
