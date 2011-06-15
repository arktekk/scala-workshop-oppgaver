package oppgave4

import org.scalatest._
import matchers.ShouldMatchers

class Oppgave4Suite extends FunSuite with ShouldMatchers {
  
  val dyretSier = Map("Dog" -> "Woof", "Cat" -> "Meow", "Cow" -> "Mooh")
  val berOmMat = Map("Woof" -> "Meat", "Meow" -> "Fish", "Mooh" -> "Grass")
  
  val oppgave4 = new Oppgave4(dyretSier, berOmMat)
  
  /* A */
  
  for((dyr, sier) <- dyretSier)
    test(dyr + " skal si " + sier){
      oppgave4.hvaSier(dyr) should be(Some(sier))
    }
    
  test("ukjent dyr sier None"){
    dyretSier.keys.foreach(k => oppgave4.hvaSier("ikkeEn"+k) should be(None))
  }
  
  /* B */
  
  test("Dog spiser Meat"){
    oppgave4.hvaSpiser("Dog") should be(Some("Meat"))
  }
  
  test("Cat spiser Fish"){
    oppgave4.hvaSpiser("Cat") should be(Some("Fish"))
  }
  
  test("Cow spiser Grass"){
    oppgave4.hvaSpiser("Cow") should be(Some("Grass"))
  }
  
  /* C */
  test("Hva spiser de dyrene vi vet om"){
    val expected = List("Dog sier Woof og liker Meat", "Cat sier Meow og liker Fish", "Cow sier Mooh og liker Grass")
    oppgave4.hvaSpiserDeViVetOm("ukjent1" :: "unkjent2" :: dyretSier.keys.toList) should be === expected
  }
  
  /* D */
  test("HVA_SPISER"){
    oppgave4.HVA_SPISER("Dog") should be(Some("MEAT"))
    oppgave4.HVA_SPISER("Cat") should be(Some("FISH"))
    oppgave4.HVA_SPISER("Horse") should be(None)
  }
  
}