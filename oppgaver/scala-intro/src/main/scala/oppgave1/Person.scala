package oppgave1

/**
 * a) lag klassen Person som tar navn som konstruktør argument
 *
 * b) implementer metoden hi(who:String):String som returnerer en hilsen (se test)
 *
 * c) flytt funksjonaliteten for "hi" ut i en trait "Hi"
 *
 * d) Implementer metoden "hi"
 *
 * e) i Hi traiten, lag metoden "upperHi" som alltid svarer det samme som "hi", men i uppercase
 *
 * f) Lag traiten "Friendly" som extender Hi (bruk f.eks collection.mutable.ListBuffer[String] for å representere venner).
 *     override metoden "hi" så den gir en vennligere hilsen til venner.
 *
 * g) Lag companion object med "factory metoder" for å opprette en Friendly og "vanlig" Person
 *
 */

trait Hi {

  def name:String

  def hi(who:String):String = "Hi " + who + ", my name is " + name

  def upperHi(who:String) = hi(who).toUpperCase
}

trait Friendly extends Hi {
  import collection.mutable.ListBuffer

  val friends = new ListBuffer[String]

  override def hi(who: String) = if(friends.contains(who)) "Hi "+who+", what's up?" else super.hi(who)
}

class Person(val name:String) extends Hi

object Person {
  def regular(name:String) = new Person(name)

  def friendly(name:String) = new Person(name) with Friendly
}