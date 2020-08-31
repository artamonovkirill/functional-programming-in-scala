ThisBuild / scalaVersion := "2.13.3"
ThisBuild / organization := "com.github.artamonovkirill"

lazy val fp = (project in file("."))
  .settings(
    name := "Functional Programming in Scala",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % Test,
    libraryDependencies += "org.scalatestplus" %% "scalatestplus-scalacheck" % "3.1.0.0-RC2" % Test,
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.3" % Test)