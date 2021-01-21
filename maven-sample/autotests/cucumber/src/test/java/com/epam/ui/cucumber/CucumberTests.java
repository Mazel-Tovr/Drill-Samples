package com.epam.ui.cucumber;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"maven-sample/autotests/cucumber/src/test/resources/com/epam/ui/cucumber/test-scenario.feature"},
        glue = {"com.epam.ui.cucumber"})
public class CucumberTests {

}
