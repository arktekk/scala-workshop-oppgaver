package bootstrap.liftweb

import net.liftweb.sitemap.{SiteMap, Menu}
import net.liftweb.http.LiftRules
class Boot {

  def boot {

    def sitemap = List(
      Menu("index") / "index"
    )

    LiftRules.setSiteMapFunc(() => SiteMap(sitemap: _*))
  }
}