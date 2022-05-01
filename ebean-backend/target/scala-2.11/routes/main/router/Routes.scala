
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/tmols/Desktop/SWE/scientist-social-network-like-follow-function/ebean-backend/conf/routes
// @DATE:Sun May 01 15:30:20 CDT 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  UserController_1: controllers.UserController,
  // @LINE:24
  DocumentController_2: controllers.DocumentController,
  // @LINE:27
  LikesController_3: controllers.LikesController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    UserController_1: controllers.UserController,
    // @LINE:24
    DocumentController_2: controllers.DocumentController,
    // @LINE:27
    LikesController_3: controllers.LikesController
  ) = this(errorHandler, HomeController_0, UserController_1, DocumentController_2, LikesController_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, UserController_1, DocumentController_2, LikesController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.authenticate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.UserController.registerNew()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.getUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """documents""", """controllers.DocumentController.getDocuments"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """likes""", """controllers.LikesController.getLikes"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_authenticate1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_authenticate1_invoker = createInvoker(
    UserController_1.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "authenticate",
      Nil,
      "POST",
      """Login""",
      this.prefix + """login"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_registerNew2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_UserController_registerNew2_invoker = createInvoker(
    UserController_1.registerNew(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerNew",
      Nil,
      "POST",
      """ Add User  {"name":name, "password":password}""",
      this.prefix + """signup"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_getUsers3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_getUsers3_invoker = createInvoker(
    UserController_1.getUsers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUsers",
      Nil,
      "GET",
      """Get User""",
      this.prefix + """users"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_DocumentController_getDocuments4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("documents")))
  )
  private[this] lazy val controllers_DocumentController_getDocuments4_invoker = createInvoker(
    DocumentController_2.getDocuments,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "getDocuments",
      Nil,
      "GET",
      """Get all documents""",
      this.prefix + """documents"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_LikesController_getLikes5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("likes")))
  )
  private[this] lazy val controllers_LikesController_getLikes5_invoker = createInvoker(
    LikesController_3.getLikes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LikesController",
      "getLikes",
      Nil,
      "GET",
      """Get all likes""",
      this.prefix + """likes"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_UserController_authenticate1_route(params) =>
      call { 
        controllers_UserController_authenticate1_invoker.call(UserController_1.authenticate())
      }
  
    // @LINE:13
    case controllers_UserController_registerNew2_route(params) =>
      call { 
        controllers_UserController_registerNew2_invoker.call(UserController_1.registerNew())
      }
  
    // @LINE:16
    case controllers_UserController_getUsers3_route(params) =>
      call { 
        controllers_UserController_getUsers3_invoker.call(UserController_1.getUsers)
      }
  
    // @LINE:24
    case controllers_DocumentController_getDocuments4_route(params) =>
      call { 
        controllers_DocumentController_getDocuments4_invoker.call(DocumentController_2.getDocuments)
      }
  
    // @LINE:27
    case controllers_LikesController_getLikes5_route(params) =>
      call { 
        controllers_LikesController_getLikes5_invoker.call(LikesController_3.getLikes)
      }
  }
}
