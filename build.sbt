lazy val root = project.in(file("."))
  .settings(
    name := "scala3-macro-annotation-incremental-compilation",
    organization := "com.example",
    scalaVersion := "3.7.3",
    scalacOptions += "-experimental",
    version := "0.1.0-SNAPSHOT",
  )
