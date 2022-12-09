package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
        
        
        features = ".\\Features\\AddCountry.feature",
        glue = "Step_definationpack",
        dryRun=false,
        monochrome = true
)



public class TestRunner_AddCountry
{    
}