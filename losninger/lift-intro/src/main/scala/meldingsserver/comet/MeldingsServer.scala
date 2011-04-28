package meldingsserver
package comet

import net.liftweb.http.ListenerManager
import net.liftweb.actor.LiftActor
import model._

object MeldingsServer extends LiftActor with ListenerManager {

  private var meldinger = List(Melding("Velkommen til meldingsserveren", Bruker("System", "Meldingsserveren")))

  protected def createUpdate = Meldinger(meldinger.take(10))

  override protected def lowPriority = {
    case m: Melding =>
      meldinger ::= m
      updateListeners()
  }
}