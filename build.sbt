name := "scala-uri-demo"

organization  := "io.lemoblabs"

version       := "0.0.1"

scalaVersion  := sys.props.getOrElse("scala.ver", "3.0.1")

resolvers += "Sonatype" at "https://oss.sonatype.org/content/groups/public"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

libraryDependencies += "io.lemonlabs" %% "scala-uri" % sys.props.getOrElse("scala.uri.ver", "4.0.0-M1")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test
