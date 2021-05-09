package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import managers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginDefinitions {
   public static WebDriver driver = Driver.getDriver();

    @Before
    public void setUp(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        //driver.quit();
    }


    @Given("^I am on the letscodeit homepage$")
    public void i_am_on_the_homepage() throws Throwable {

        driver.get("https://letskodeit.teachable.com/");

        // Navigate to the web page
        System.out.println("I'm on the home page");

//       ExtentManager.createInstance(); // generate our custom html nice looking report: open in test-outout/LetsKodeIt_reports
    }


    @And("I navigate to practice page")
    public void iNavigateToPracticePage() {
        driver. findElement(By.cssSelector("li:nth-of-type(1) > .fedora-navbar-link.navbar-link")).click();
    }

    /**
     * Positive Page Title Test
     */
    @Then("I assert the page title")
    public void iAssertThePageTitle() {
        String expected = driver.getTitle();
        String actual = "Home | Let's Kode It";
        System.out.println("Expected : " + expected); // just for checking out the title
        System.out.println("Actual : " + actual);
        Assert.assertEquals(actual, expected);
    }

    /**
     * Negative Page Title Test
     * @param dataTable with Headers
     */
    @Then("I assert the <page title>")
    public void iAssertThePageTitle(DataTable dataTable) {
        List<String> data = dataTable.row(0);
        String wrongData = data.get(0);
        String expectedData = data.get(1);
        Assert.assertEquals(wrongData, expectedData );
    }
}
