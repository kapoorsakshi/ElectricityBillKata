package stepdefs;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/resources/Electrictybill.feature",
		glue= {"stepdefs"},
		plugin= {"pretty"}
		
		
	)

public class TestRunner {
	
	

}