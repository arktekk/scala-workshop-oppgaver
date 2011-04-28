package meldingsserver
package model

case class Bruker(username:String, name:String)

case class Melding(tekst:String, bruker:Bruker)
case class Meldinger(meldinger:List[Melding])
