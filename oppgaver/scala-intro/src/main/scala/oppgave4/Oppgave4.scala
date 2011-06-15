package oppgave4

/**
 * e.g
 * val dyretSier = Map("Dog" -> "Woof", "Cat" -> "Meow", "Cow" -> "Mooh")
 * val berOmMat = Map("Woof" -> "Meat", "Meow" -> "Fish", "Mooh" -> "Grass")
 */
class Oppgave4(dyretSier:Map[String, String], berOmMat:Map[String, String]) {
  // sys.error("returner 'Some' med hva dyret sier om det finnes, eller 'None' hvis det ikke finnes")
  def hvaSier(dyr:String):Option[String] = dyretSier.get(dyr)
  
  // sys.error("returner 'Some' med hva dyret spiser om det finnes, eller 'None' hvis det ikke finnes")
  def hvaSpiser(dyr:String):Option[String] = 
    for{
      sier <- dyretSier.get(dyr)
      spiser <- berOmMat.get(sier)
    } yield spiser
  
  // sys.error("returner List med en setning som beskriver hva de dyrene vi kjenner til sier og spiser")
  def hvaSpiserDeViVetOm(dyrene:List[String]):List[String] =
    for{
      dyr <- dyrene
      sier <- dyretSier.get(dyr)
      mat <- berOmMat.get(sier)
    } yield dyr + " sier " + sier + " og liker " + mat
    
  // sys.error("returner Some med uppercase hva dyret spiser om det finnes, eller None hvis det ikke finnes (benytt hvaSpiser, og toUpperCase metoden til String)")
  def HVA_SPISER(dyr:String):Option[String] = hvaSpiser(dyr).map(n => n.toUpperCase)
}