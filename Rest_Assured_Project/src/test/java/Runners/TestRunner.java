package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/"},
        glue = {"Steps"},
        tags = {"@APISuite"}
        //tags = {"@Put"}
      	//tags = {"@Get"}
       	//tags= {"@post"}
        //tags = {"@Delete"}
       )

public class  TestRunner{
}
