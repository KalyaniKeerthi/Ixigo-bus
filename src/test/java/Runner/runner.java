package Runner;

//import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "feature",glue = "IxigoStepdefinations",
plugin={"pretty","json:target/cucumberReports.xml"}
)
//plugin={"pretty","json:target/cucumberReports.json"}

//plugin={"pretty","junit:target/cucumberReports.xml"}
//com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:
public class runner extends AbstractTestNGCucumberTests{
	
}
