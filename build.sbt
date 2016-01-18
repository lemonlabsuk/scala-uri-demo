name := "scala-uri-demo"

organization  := "com.netaporter"

version       := "0.0.1"

scalaVersion  := "2.11.7"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

libraryDependencies += "com.netaporter" %% "scala-uri" % "0.4.12-SNAPSHOT"
