package meldingsserver
package snippet

import LogIn.InnloggetBruker
import net.liftweb.util.Helpers._
import net.liftweb.http.{S, SHtml, DispatchSnippet}
import net.liftweb.http.js.JsCmds._
import comet.MeldingsServer
import model._
import net.liftweb.http.js.JsCmd

object MeldingsSender extends DispatchSnippet {

  def dispatch = {
    case "send" => send
  }

  def send = {
    var melding = ""

    def onSubmit(): JsCmd = {
      if (melding.trim().size > 140) {
        S.error("Meldingen kan max være 140 tegn.")
        Noop
      } else {
        InnloggetBruker.foreach(b => MeldingsServer ! Melding(melding, b))
        SetValById("melding", "")
      }
    }

    "#melding" #> (SHtml.text("", melding = _, "id" -> "melding") ++ SHtml.hidden(onSubmit))
  }
}