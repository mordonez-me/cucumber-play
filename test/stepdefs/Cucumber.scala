import org.junit.runner.RunWith
import cucumber.api.junit.Cucumber
import cucumber.api.CucumberOptions

@RunWith(classOf[Cucumber])
@CucumberOptions(
  strict=true,
  plugin = Array("pretty", "html:target/cucumber-report")
)
class RunCucumber
