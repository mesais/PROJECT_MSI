package stepDefs;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownSteps {


    @When("select benz option at dropdown")
    public void iSelectFromTheListOfOptions() {
        WebElement select4 = LoginDefinitions.driver.findElement(By.cssSelector("select#carselect")); // locator of the dropdown
        Select select = new Select(select4); // select object to call options: two ways; by getOptions or selectByValue or selectByIndex
        select.getOptions().get(1).click(); // select/click on last option that is honda as expected

        System.out.println("Benz selected dropdown?: " + select.getOptions().get(1).isSelected());

    }
}
