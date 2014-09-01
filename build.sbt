scalaVersion in ThisBuild := "2.11.2"

lazy val root = project.in(file(".")).aggregate(ProjectRef(file("app"), "app"), ProjectRef(file("dal"), "dal"))
