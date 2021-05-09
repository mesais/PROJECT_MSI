package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import managers.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class RadioButtonSteps {
    WebDriver driver;

    @Then("BMW radio button test")
    public void iClickOnBMWButton() {
       LoginDefinitions.driver.findElement(By.cssSelector("#radio-btn-example [for='bmw']")).click();
    }




}
