package meldingsserver
package snippet

import model.Bruker
import net.liftweb.http.{SHtml, S, DispatchSnippet, SessionVar}
import net.liftweb.util.Helpers._

object innloggetBruker extends SessionVar[Option[Bruker]](None)

object LogIn extends DispatchSnippet {

  def dispatch = {
    case "login" => login
  }

  def login = {
    var username = ""
    var name = ""

    def onSubmit() {
      val u = username.trim
      val n = name.trim
      if (u.size <= 3 || n.size <= 3) {
        S.error("Brukernavn og navn må være lengre enn 3 tegn.")
      } else {
        innloggetBruker(Some(Bruker(u, n)))
        S.redirectTo("/index")
      }
    }

    "#username" #> SHtml.text("", username = _) &
    "#name"     #> SHtml.text("", name = _) &
    ":submit"   #> SHtml.onSubmitUnit(() => onSubmit())
  }
}