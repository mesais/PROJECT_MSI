package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class CheckBoxSteps {

    @Then("check <this option>")
    public void checkThisOption(DataTable dataTable) {
        List<String> data = dataTable.row(0);
        String optionPeach = data.get(0);
        WebElement selectAll = LoginDefinitions.driver.findElement(By.cssSelector("#multiple-select-example"));
        Select select = new Select(selectAll);
        select.selectByValue(optionPeach); // selecting peach option

        boolean result = select.getOptions().get(2).isSelected();
        Assert.assertTrue(result);


    }
}
