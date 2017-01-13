name := "tut-plugin"

scalaVersion := "2.10.6"

sbtPlugin := true

publishMavenStyle := false

enablePlugins(BuildInfoPlugin)
buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion)
buildInfoPackage := "tut"
