import sbt._

class Project(info:ProjectInfo) extends DefaultWebProject(info) with IdeaProject {
  
  override def libraryDependencies = Set(
    "net.liftweb" %% "lift-webkit" % "2.3" % "compile->default" withSources,
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
    "org.scalatest" % "scalatest" % "1.3" % "test->default"
  ) ++ super.libraryDependencies
}
