import io.lemonlabs.uri.Url

object ScalaUriDemo extends App {
  val uri = Url.parse("https://github.com/lemonlabsuk/scala-uri?utf8=✓#parsing-urls")

  println(s"""
    ===
    uri = $uri
    ===

    type = ${uri.getClass.getSimpleName}
    scheme = ${uri.schemeOption}
    host = ${uri.hostOption}
    hostType = ${uri.hostOption.map(_.getClass.getSimpleName)}
    publicSuffix = ${uri.publicSuffix}
    path = ${uri.path}
    query = ${uri.query}
    fragment = ${uri.fragment}
  """)
}
