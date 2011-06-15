import sbt._

class Project(info:ProjectInfo) extends DefaultProject(info){
  lazy val spring_core = "org.springframework" % "spring-core" % "3.0.5.RELEASE"
  lazy val spring_context = "org.springframework" % "spring-context" % "3.0.5.RELEASE"
  lazy val scalatest = "org.scalatest" % "scalatest" % "1.3" % "test"
}
