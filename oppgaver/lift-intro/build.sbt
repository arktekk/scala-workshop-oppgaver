
scalaVersion := "2.9.0"

seq(WebPlugin.webSettings :_*)

libraryDependencies ++= Seq(
   "net.liftweb" %% "lift-webkit" % "2.4-M2" % "compile",
   "org.mortbay.jetty" % "jetty" % "6.1.22" % "jetty",
   "org.scalatest" % "scalatest" % "1.3" % "test")

