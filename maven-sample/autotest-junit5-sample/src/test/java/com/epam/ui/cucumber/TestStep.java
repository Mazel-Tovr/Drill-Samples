package com.epam.ui.cucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.time.Duration;

public class TestStep {

    private static WebDriver driver;
    private static DevTools chromeDevTools;
    private static String appUrl;

    @Before
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        appUrl = "http://localhost:8080";
        driver = new ChromeDriver();
        chromeDevTools = ((ChromeDriver) driver).getDevTools();
        chromeDevTools.createSession();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }


    @Given("go to find owner page")
    public void goToFindOwnerPage() {
        driver.get(appUrl);
        driver.findElement(By.xpath("//a[@title='find owners']")).click();
    }

    @When("write in search label Davis")
    public void writeInSearchLabel() {
        driver.findElement(By.id("lastName")).sendKeys("Davis");
    }

    @And("press search button")
    public void pressSearchButton() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("you found him")
    public void youFoundOwner() {
        String owner = driver.findElement(By.xpath("//a[@href='/owners/2']")).getText();
        System.out.println(owner);
        Assertions.assertEquals("Betty Davis",owner);
    }



}
