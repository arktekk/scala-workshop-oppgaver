package meldingsserver
package comet

import model._
import net.liftweb.http.{CometActor, CometListener}
import net.liftweb.util.ClearClearable

class MeldingsListe extends CometActor with CometListener {

  private var meldinger = List.empty[Melding]

  def render = "li *" #> meldinger.map(m => "%s sa: %s".format(m.bruker.username, m.tekst)) & ClearClearable

  protected def registerWith = MeldingsServer

  override def lowPriority = {
    case Meldinger(m) =>
      meldinger = m
      reRender()
  }
}