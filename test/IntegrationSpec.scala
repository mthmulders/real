import org.scalatestplus.play._
import play.api.test._
import play.api.test.Helpers._

class IntegrationSpec extends PlaySpec with OneServerPerTest with OneBrowserPerTest with HtmlUnitFactory {

  "Application home page" should {
    "mention main features" in {
      go to ("http://localhost:" + port)
      pageTitle mustBe "Welcome to REAL"
      pageSource must include ("best suited for managing")
      pageSource must include ("foosball")
      pageSource must include ("tournaments")
    }
  }
}
