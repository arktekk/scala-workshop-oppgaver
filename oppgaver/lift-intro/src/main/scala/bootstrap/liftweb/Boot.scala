package bootstrap.liftweb

import net.liftweb.sitemap.{SiteMap, Menu}
import net.liftweb.http.{NoticeType, LiftRules}
import net.liftweb.common.Full
import net.liftweb.util.Helpers._

class Boot {

  def boot {

    def sitemap = List(
      Menu("index") / "index"
    )

    LiftRules.addToPackages("meldingsserver")

    LiftRules.setSiteMapFunc(() => SiteMap(sitemap: _*))

    LiftRules.noticesAutoFadeOut.default.set((noticeType: NoticeType.Value) => Full((2 seconds, 4 seconds)))
  }
}