name := "scala-uri-demo"

organization  := "com.netaporter"

version       := "0.0.1"

scalaVersion  := "2.12.1"

resolvers += "Sonatype" at "https://oss.sonatype.org/content/groups/public"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

libraryDependencies += "io.lemonlabs" %% "scala-uri" % sys.props.getOrElse("scala.uri.ver", "0.5.0")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
