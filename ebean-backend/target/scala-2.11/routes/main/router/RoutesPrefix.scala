
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/tmols/Desktop/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Fri Apr 29 15:31:51 CDT 2022


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
