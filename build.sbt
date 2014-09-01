scalaVersion := "2.11.2"

val scalaTest = "org.scalatest" %% "scalatest" % "2.2.1" % Test

val dataFiles = taskKey[Seq[File]]("My unmanaged data files")

val dataFileSettings = List(Compile, Test) map { config => (unmanagedResources in config) ++= dataFiles.value } //try: ~test or ~run

lazy val dal = project.in(file("dal"))  //lazy val to avoid initialization issues
  .settings(Seq(
      libraryDependencies += scalaTest,
      dataFiles := file("data").listFiles.toSeq //or: new java.io.File()
    ) ++ dataFileSettings : _*
  )
