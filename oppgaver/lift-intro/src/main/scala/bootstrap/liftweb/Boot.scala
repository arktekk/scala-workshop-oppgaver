package bootstrap.liftweb

import net.liftweb.sitemap.{SiteMap, Menu, Loc}
import Loc._
import net.liftweb.http.LiftRules
class Boot {

  def boot {

    def sitemap = List(
      Menu("index") / "index" >> Hidden
    )

    LiftRules.setSiteMapFunc(() => SiteMap(sitemap: _*))
  }
}