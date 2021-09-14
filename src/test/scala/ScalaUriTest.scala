import io.lemonlabs.uri.{AbsolutePath, DomainName, Url, UrlPath}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ScalaUriTest extends AnyFlatSpec with Matchers {
  "scala-uri" should "parse the host and path" in {
    val uri = Url.parse("http://github.com/lemonlabsuk/scala-uri")
    uri.hostOption should equal(Some(DomainName("github.com")))
    uri.path should equal(AbsolutePath.fromParts("lemonlabsuk", "scala-uri"))
  }
}
