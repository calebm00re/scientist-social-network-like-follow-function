
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/loganschmitt/scientist-social-network-like-follow-function/ebean-backend/conf/routes
// @DATE:Sun May 01 19:57:10 CDT 2022

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
  // @LINE:22
  DocumentController_2: controllers.DocumentController,
  // @LINE:31
  LikesController_3: controllers.LikesController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    UserController_1: controllers.UserController,
    // @LINE:22
    DocumentController_2: controllers.DocumentController,
    // @LINE:31
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>""", """controllers.UserController.getUser(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """documents""", """controllers.DocumentController.getDocuments"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addDocument""", """controllers.DocumentController.addDocument"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """documents/""" + "$" + """document_id<[^/]+>""", """controllers.DocumentController.getDocument(document_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """likes""", """controllers.LikesController.getLikes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """likes/""" + "$" + """user_id<[^/]+>""", """controllers.LikesController.getLikesbyId(user_id:Long)"""),
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

  // @LINE:12
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

  // @LINE:15
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

  // @LINE:19
  private[this] lazy val controllers_UserController_getUser4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getUser4_invoker = createInvoker(
    UserController_1.getUser(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUser",
      Seq(classOf[Long]),
      "GET",
      """Get User""",
      this.prefix + """users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_DocumentController_getDocuments5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("documents")))
  )
  private[this] lazy val controllers_DocumentController_getDocuments5_invoker = createInvoker(
    DocumentController_2.getDocuments,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "getDocuments",
      Nil,
      "POST",
      """Get all documents""",
      this.prefix + """documents"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_DocumentController_addDocument6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addDocument")))
  )
  private[this] lazy val controllers_DocumentController_addDocument6_invoker = createInvoker(
    DocumentController_2.addDocument,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "addDocument",
      Nil,
      "POST",
      """add document""",
      this.prefix + """addDocument"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_DocumentController_getDocument7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("documents/"), DynamicPart("document_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocumentController_getDocument7_invoker = createInvoker(
    DocumentController_2.getDocument(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "getDocument",
      Seq(classOf[Long]),
      "GET",
      """Get document by document_id""",
      this.prefix + """documents/""" + "$" + """document_id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_LikesController_getLikes8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("likes")))
  )
  private[this] lazy val controllers_LikesController_getLikes8_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_LikesController_getLikesbyId9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("likes/"), DynamicPart("user_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LikesController_getLikesbyId9_invoker = createInvoker(
    LikesController_3.getLikesbyId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LikesController",
      "getLikesbyId",
      Seq(classOf[Long]),
      "GET",
      """Get all likes by a user""",
      this.prefix + """likes/""" + "$" + """user_id<[^/]+>"""
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
  
    // @LINE:12
    case controllers_UserController_registerNew2_route(params) =>
      call { 
        controllers_UserController_registerNew2_invoker.call(UserController_1.registerNew())
      }
  
    // @LINE:15
    case controllers_UserController_getUsers3_route(params) =>
      call { 
        controllers_UserController_getUsers3_invoker.call(UserController_1.getUsers)
      }
  
    // @LINE:19
    case controllers_UserController_getUser4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_getUser4_invoker.call(UserController_1.getUser(id))
      }
  
    // @LINE:22
    case controllers_DocumentController_getDocuments5_route(params) =>
      call { 
        controllers_DocumentController_getDocuments5_invoker.call(DocumentController_2.getDocuments)
      }
  
    // @LINE:25
    case controllers_DocumentController_addDocument6_route(params) =>
      call { 
        controllers_DocumentController_addDocument6_invoker.call(DocumentController_2.addDocument)
      }
  
    // @LINE:28
    case controllers_DocumentController_getDocument7_route(params) =>
      call(params.fromPath[Long]("document_id", None)) { (document_id) =>
        controllers_DocumentController_getDocument7_invoker.call(DocumentController_2.getDocument(document_id))
      }
  
    // @LINE:31
    case controllers_LikesController_getLikes8_route(params) =>
      call { 
        controllers_LikesController_getLikes8_invoker.call(LikesController_3.getLikes)
      }
  
    // @LINE:34
    case controllers_LikesController_getLikesbyId9_route(params) =>
      call(params.fromPath[Long]("user_id", None)) { (user_id) =>
        controllers_LikesController_getLikesbyId9_invoker.call(LikesController_3.getLikesbyId(user_id))
      }
  }
}
