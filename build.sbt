name := "scala-uri-demo"

organization  := "com.netaporter"

version       := "0.0.1"

scalaVersion  := sys.props.getOrElse("scala.ver", "2.13.0")

resolvers += "Sonatype" at "https://oss.sonatype.org/content/groups/public"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

libraryDependencies ++= Seq(
  "io.lemonlabs" %% "scala-uri" % sys.props.getOrElse("scala.uri.ver", "2.0.0-M2"),
  "io.lemonlabs" %% "scala-uri-circe" % sys.props.getOrElse("scala.uri.ver", "2.0.0-M2"),
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)
