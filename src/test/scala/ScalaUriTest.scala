import io.lemonlabs.uri.{AbsolutePath, DomainName, Url, UrlPath}
import org.scalatest.{FlatSpec, Matchers}

class ScalaUriTest extends FlatSpec with Matchers {
  "scala-uri" should "parse the host and path" in {
    val uri = Url.parse("http://github.com/lemonlabsuk/scala-uri")
    uri.hostOption should equal(Some(DomainName("github.com")))
    uri.path should equal(AbsolutePath.fromParts("lemonlabsuk", "scala-uri"))
  }
}
