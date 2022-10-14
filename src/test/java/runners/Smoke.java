package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps",
        //when dry run set to true, it stops the actual execution and check for the step definition
        dryRun = false,
        monochrome = true,
        tags = "@C766562",
        plugin = {"pretty", "html:target/cucumber.html",
                "json:target/cucumber.json",
                "rerun:target/failed.txt"}
)

public class Smoke {

}
