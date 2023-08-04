package Runner;
import Pages.HomePage;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features ="src/test/java/features",glue = {"StepDefinition"}
        ,plugin ={"pretty","html:target/cucumber-html-report"})


public class Runner extends HomePage {

}
