name := "scala-uri-demo"

organization  := "com.netaporter"

version       := "0.0.1"

scalaVersion  := sys.props.getOrElse("scala.ver", "2.13.0")

resolvers += "Sonatype" at "https://oss.sonatype.org/content/groups/public"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

libraryDependencies += "io.lemonlabs" %% "scala-uri" % sys.props.getOrElse("scala.uri.ver", "1.4.8")

libraryDependencies += "io.spray" %% "spray-json" % "1.3.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"
