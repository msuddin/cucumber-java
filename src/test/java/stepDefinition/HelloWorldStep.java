package stepDefinition;

import application.MainApplication;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

public class HelloWorldStep {

    private MainApplication app;

    @Before
    public void setUp() {
        app = new MainApplication();
    }

    @Given("^I have pass in \"([^\"]*)\"$")
    public void iHavePassIn(String inputString) {
        app.setInputString(inputString);
    }

    @Then("^I should get \"([^\"]*)\"$")
    public void iShouldGet(String expectedString) {
        Assert.assertThat(app.getInputString(), is(expectedString));
    }
}
