scalaVersion := "2.11.2"

val scalaTest = "org.scalatest" %% "scalatest" % "2.2.1" % Test

libraryDependencies += scalaTest

val dataFiles = settingKey[Seq[File]]("My unmanaged data files")

dataFiles := file("data").listFiles.toSeq //or: new java.io.File()
