package bootstrap.liftweb

import meldingsserver.snippet.innloggetBruker
import net.liftweb.sitemap.{SiteMap, Menu, Loc}
import Loc._
import net.liftweb.http.{NoticeType, RedirectResponse, LiftRules}
import net.liftweb.common.Full
import net.liftweb.util.Helpers._

class Boot {

  def boot {

    val KreverInnlogging = If(
      () => innloggetBruker.isDefined,
      () => RedirectResponse("/login")
    )

    def sitemap = List(
      Menu("index") / "index" >> KreverInnlogging,
      Menu("login") / "login"
    )

    LiftRules.addToPackages("meldingsserver")

    LiftRules.setSiteMapFunc(() => SiteMap(sitemap: _*))

    LiftRules.noticesAutoFadeOut.default.set((noticeType: NoticeType.Value) => Full((2 seconds, 4 seconds)))
  }
}