package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json","rerun:target/failed.txt"},
        // pretty help console show more details
        dryRun = false,
        //monochrome = true, in intelliJ it is better not using monochrome
        publish = true)
        //publish - help to share the report with the team to the cloud without using a token

public class TestRunner extends AbstractTestNGCucumberTests {
// AbstractTestNGCucumberTests used for run in parallel mode

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }





}
