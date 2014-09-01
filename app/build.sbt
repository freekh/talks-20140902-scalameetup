lazy val app = project.in(file(".")).dependsOn(ProjectRef(file("../dal"), "dal"))
