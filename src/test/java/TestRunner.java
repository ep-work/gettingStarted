import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"boom/StepDefs/StepDefs"})

public class TestRunner extends AbstractTestNGCucumberTests {}