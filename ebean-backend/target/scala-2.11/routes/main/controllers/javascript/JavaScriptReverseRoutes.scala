
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/tmols/Desktop/SWE/scientist-social-network-like-follow-function/ebean-backend/conf/routes
// @DATE:Mon May 02 00:26:46 CDT 2022

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:21
  class ReverseDocumentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def getDocuments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentController.getDocuments",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "documents"})
        }
      """
    )
  
    // @LINE:24
    def addDocument: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentController.addDocument",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addDocument"})
        }
      """
    )
  
    // @LINE:27
    def getDocument: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DocumentController.getDocument",
      """
        function(document_id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "documents/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("document_id", document_id0)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def getUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUser",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:15
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:9
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:12
    def registerNew: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.registerNew",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseLikesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def unlike: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LikesController.unlike",
      """
        function(document_id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "unlike/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("document_id", document_id0)})
        }
      """
    )
  
    // @LINE:30
    def getLikes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LikesController.getLikes",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "likes"})
        }
      """
    )
  
    // @LINE:36
    def getLikesbyId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LikesController.getLikesbyId",
      """
        function(user_id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "likes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("user_id", user_id0)})
        }
      """
    )
  
    // @LINE:32
    def addLike: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LikesController.addLike",
      """
        function(document_id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addLike/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("document_id", document_id0)})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseFollowsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def unfollow: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FollowsController.unfollow",
      """
        function(document_id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "unfollow/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("document_id", document_id0)})
        }
      """
    )
  
    // @LINE:40
    def getFollows: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FollowsController.getFollows",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "follows"})
        }
      """
    )
  
    // @LINE:42
    def addFollow: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FollowsController.addFollow",
      """
        function(document_id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addFollow/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("document_id", document_id0)})
        }
      """
    )
  
    // @LINE:46
    def getFollowsbyId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FollowsController.getFollowsbyId",
      """
        function(user_id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "follows/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("user_id", user_id0)})
        }
      """
    )
  
  }


}
