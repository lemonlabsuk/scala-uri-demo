import com.netaporter.uri.Uri
import com.netaporter.uri.parsing._
import org.scalatest.{FlatSpec, Matchers}

class ParsingTests extends FlatSpec with Matchers {
  "scala-uri" should "parse the host and path" in {
    val uri = Uri.parse("http://github.com/lemonlabsuk/scala-uri")
    uri.host should equal (Some("github.com"))
    uri.path should equal ("/lemonlabsuk/scala-uri")
  }
}
