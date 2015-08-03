// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "Example"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

persistLauncher in Compile := true

persistLauncher in Test := false

testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.8.1",
    "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
)

// Enable for development, not release; may need to change directory
lazy val scalajs_mapbox = RootProject(file("../scalajs-mapbox"))
lazy val root = project.dependsOn(scalajs_mapbox)