package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.junit.runner.RunWith;
import utils.CommonMethods;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps",
        dryRun = false,
        monochrome = true,
        tags = "@outline",
        plugin = {"pretty", "html:target/cucumber.html",
        "json:target/cucumber.json",
        "rerun:target/failed.txt"}
)

public class Smoke {
}
