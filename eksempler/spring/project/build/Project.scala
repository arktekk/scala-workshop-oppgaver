import sbt._

class Project(info:ProjectInfo) extends DefaultProject(info){
  lazy val spring_core = "org.springframework" % "spring-core" % "3.0.5.RELEASE"
  lazy val spring_context = "org.springframework" % "spring-context" % "3.0.5.RELEASE"
  lazy val scalatest = "org.scalatest" % "scalatest" % "1.3" % "test"
  lazy val junit = "junit" % "junit" % "4.8.2" % "test" // to be able to run tests from Maven
}
