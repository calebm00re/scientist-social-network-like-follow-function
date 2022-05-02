
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/tmols/Desktop/SWE/scientist-social-network-like-follow-function/ebean-backend/conf/routes
// @DATE:Mon May 02 00:26:46 CDT 2022

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
  HomeController_1: controllers.HomeController,
  // @LINE:9
  UserController_2: controllers.UserController,
  // @LINE:21
  DocumentController_3: controllers.DocumentController,
  // @LINE:30
  LikesController_0: controllers.LikesController,
  // @LINE:40
  FollowsController_4: controllers.FollowsController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:9
    UserController_2: controllers.UserController,
    // @LINE:21
    DocumentController_3: controllers.DocumentController,
    // @LINE:30
    LikesController_0: controllers.LikesController,
    // @LINE:40
    FollowsController_4: controllers.FollowsController
  ) = this(errorHandler, HomeController_1, UserController_2, DocumentController_3, LikesController_0, FollowsController_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, UserController_2, DocumentController_3, LikesController_0, FollowsController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.authenticate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.UserController.registerNew()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.getUsers"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>""", """controllers.UserController.getUser(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """documents""", """controllers.DocumentController.getDocuments"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addDocument""", """controllers.DocumentController.addDocument"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """documents/""" + "$" + """document_id<[^/]+>""", """controllers.DocumentController.getDocument(document_id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """likes""", """controllers.LikesController.getLikes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addLike/""" + "$" + """document_id<[^/]+>""", """controllers.LikesController.addLike(document_id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """unlike/""" + "$" + """document_id<[^/]+>""", """controllers.LikesController.unlike(document_id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """likes/""" + "$" + """user_id<[^/]+>""", """controllers.LikesController.getLikesbyId(user_id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """follows""", """controllers.FollowsController.getFollows"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addFollow/""" + "$" + """document_id<[^/]+>""", """controllers.FollowsController.addFollow(document_id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """unfollow/""" + "$" + """document_id<[^/]+>""", """controllers.FollowsController.unfollow(document_id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """follows/""" + "$" + """user_id<[^/]+>""", """controllers.FollowsController.getFollowsbyId(user_id:Long)"""),
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
    HomeController_1.index,
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
    UserController_2.authenticate(),
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
    UserController_2.registerNew(),
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
    UserController_2.getUsers,
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

  // @LINE:18
  private[this] lazy val controllers_UserController_getUser4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getUser4_invoker = createInvoker(
    UserController_2.getUser(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUser",
      Seq(classOf[Long]),
      "POST",
      """Get User""",
      this.prefix + """users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_DocumentController_getDocuments5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("documents")))
  )
  private[this] lazy val controllers_DocumentController_getDocuments5_invoker = createInvoker(
    DocumentController_3.getDocuments,
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

  // @LINE:24
  private[this] lazy val controllers_DocumentController_addDocument6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addDocument")))
  )
  private[this] lazy val controllers_DocumentController_addDocument6_invoker = createInvoker(
    DocumentController_3.addDocument,
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

  // @LINE:27
  private[this] lazy val controllers_DocumentController_getDocument7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("documents/"), DynamicPart("document_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DocumentController_getDocument7_invoker = createInvoker(
    DocumentController_3.getDocument(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DocumentController",
      "getDocument",
      Seq(classOf[Long]),
      "POST",
      """Get document by document_id""",
      this.prefix + """documents/""" + "$" + """document_id<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_LikesController_getLikes8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("likes")))
  )
  private[this] lazy val controllers_LikesController_getLikes8_invoker = createInvoker(
    LikesController_0.getLikes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LikesController",
      "getLikes",
      Nil,
      "POST",
      """Get all likes""",
      this.prefix + """likes"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_LikesController_addLike9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addLike/"), DynamicPart("document_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LikesController_addLike9_invoker = createInvoker(
    LikesController_0.addLike(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LikesController",
      "addLike",
      Seq(classOf[Long]),
      "POST",
      """Add Like""",
      this.prefix + """addLike/""" + "$" + """document_id<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_LikesController_unlike10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("unlike/"), DynamicPart("document_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LikesController_unlike10_invoker = createInvoker(
    LikesController_0.unlike(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LikesController",
      "unlike",
      Seq(classOf[Long]),
      "POST",
      """Unlike""",
      this.prefix + """unlike/""" + "$" + """document_id<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_LikesController_getLikesbyId11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("likes/"), DynamicPart("user_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LikesController_getLikesbyId11_invoker = createInvoker(
    LikesController_0.getLikesbyId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LikesController",
      "getLikesbyId",
      Seq(classOf[Long]),
      "POST",
      """Get all likes by a user""",
      this.prefix + """likes/""" + "$" + """user_id<[^/]+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_FollowsController_getFollows12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("follows")))
  )
  private[this] lazy val controllers_FollowsController_getFollows12_invoker = createInvoker(
    FollowsController_4.getFollows,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FollowsController",
      "getFollows",
      Nil,
      "POST",
      """Get all likes""",
      this.prefix + """follows"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_FollowsController_addFollow13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addFollow/"), DynamicPart("document_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FollowsController_addFollow13_invoker = createInvoker(
    FollowsController_4.addFollow(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FollowsController",
      "addFollow",
      Seq(classOf[Long]),
      "POST",
      """Add Like""",
      this.prefix + """addFollow/""" + "$" + """document_id<[^/]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_FollowsController_unfollow14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("unfollow/"), DynamicPart("document_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FollowsController_unfollow14_invoker = createInvoker(
    FollowsController_4.unfollow(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FollowsController",
      "unfollow",
      Seq(classOf[Long]),
      "POST",
      """Unlike""",
      this.prefix + """unfollow/""" + "$" + """document_id<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_FollowsController_getFollowsbyId15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("follows/"), DynamicPart("user_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FollowsController_getFollowsbyId15_invoker = createInvoker(
    FollowsController_4.getFollowsbyId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FollowsController",
      "getFollowsbyId",
      Seq(classOf[Long]),
      "POST",
      """Get all likes by a user""",
      this.prefix + """follows/""" + "$" + """user_id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:9
    case controllers_UserController_authenticate1_route(params) =>
      call { 
        controllers_UserController_authenticate1_invoker.call(UserController_2.authenticate())
      }
  
    // @LINE:12
    case controllers_UserController_registerNew2_route(params) =>
      call { 
        controllers_UserController_registerNew2_invoker.call(UserController_2.registerNew())
      }
  
    // @LINE:15
    case controllers_UserController_getUsers3_route(params) =>
      call { 
        controllers_UserController_getUsers3_invoker.call(UserController_2.getUsers)
      }
  
    // @LINE:18
    case controllers_UserController_getUser4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_getUser4_invoker.call(UserController_2.getUser(id))
      }
  
    // @LINE:21
    case controllers_DocumentController_getDocuments5_route(params) =>
      call { 
        controllers_DocumentController_getDocuments5_invoker.call(DocumentController_3.getDocuments)
      }
  
    // @LINE:24
    case controllers_DocumentController_addDocument6_route(params) =>
      call { 
        controllers_DocumentController_addDocument6_invoker.call(DocumentController_3.addDocument)
      }
  
    // @LINE:27
    case controllers_DocumentController_getDocument7_route(params) =>
      call(params.fromPath[Long]("document_id", None)) { (document_id) =>
        controllers_DocumentController_getDocument7_invoker.call(DocumentController_3.getDocument(document_id))
      }
  
    // @LINE:30
    case controllers_LikesController_getLikes8_route(params) =>
      call { 
        controllers_LikesController_getLikes8_invoker.call(LikesController_0.getLikes)
      }
  
    // @LINE:32
    case controllers_LikesController_addLike9_route(params) =>
      call(params.fromPath[Long]("document_id", None)) { (document_id) =>
        controllers_LikesController_addLike9_invoker.call(LikesController_0.addLike(document_id))
      }
  
    // @LINE:34
    case controllers_LikesController_unlike10_route(params) =>
      call(params.fromPath[Long]("document_id", None)) { (document_id) =>
        controllers_LikesController_unlike10_invoker.call(LikesController_0.unlike(document_id))
      }
  
    // @LINE:36
    case controllers_LikesController_getLikesbyId11_route(params) =>
      call(params.fromPath[Long]("user_id", None)) { (user_id) =>
        controllers_LikesController_getLikesbyId11_invoker.call(LikesController_0.getLikesbyId(user_id))
      }
  
    // @LINE:40
    case controllers_FollowsController_getFollows12_route(params) =>
      call { 
        controllers_FollowsController_getFollows12_invoker.call(FollowsController_4.getFollows)
      }
  
    // @LINE:42
    case controllers_FollowsController_addFollow13_route(params) =>
      call(params.fromPath[Long]("document_id", None)) { (document_id) =>
        controllers_FollowsController_addFollow13_invoker.call(FollowsController_4.addFollow(document_id))
      }
  
    // @LINE:44
    case controllers_FollowsController_unfollow14_route(params) =>
      call(params.fromPath[Long]("document_id", None)) { (document_id) =>
        controllers_FollowsController_unfollow14_invoker.call(FollowsController_4.unfollow(document_id))
      }
  
    // @LINE:46
    case controllers_FollowsController_getFollowsbyId15_route(params) =>
      call(params.fromPath[Long]("user_id", None)) { (user_id) =>
        controllers_FollowsController_getFollowsbyId15_invoker.call(FollowsController_4.getFollowsbyId(user_id))
      }
  }
}
