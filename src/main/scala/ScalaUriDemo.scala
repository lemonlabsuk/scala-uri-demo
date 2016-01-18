import com.netaporter.uri._
import com.netaporter.uri.dsl._

object ScalaUriDemo extends App {
  val uri = "https://github.com/NET-A-PORTER" / "scala-uri" ? ("utf8" -> "✓") `#` "parsing-uris"

  println(s"""
    ===
    uri = ${uri}
    ===

    scheme = ${uri.scheme}
    host = ${uri.host}
    publicSuffix = ${uri.publicSuffix}
    path = ${uri.path}
    query = ${uri.query}
    fragment = ${uri.fragment}
  """)
}
