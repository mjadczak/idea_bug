ThisBuild / organization := "uk.co.mjdk"
ThisBuild / scalaVersion := "2.13.3"
ThisBuild / version := "0.1.0-SNAPSHOT"

val zioVersion    = "1.0.0-RC21-2"
val doobieVersion = "0.9.0"

lazy val `idea-bug` = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "dev.zio"              %% "zio"                 % zioVersion,
      "io.github.gaelrenoux" %% "tranzactio"          % "0.6.0",
      "org.tpolecat"         %% "doobie-core"         % doobieVersion,
    ),
  )

