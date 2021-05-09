package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import managers.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class ScreenshotStep {

    @Then("Take a screenshot")
    public void iTakeAScreenshotOfThePage() throws IOException, AWTException {
        File file = ((TakesScreenshot) Driver.driver).getScreenshotAs(OutputType.FILE);
        // String timestamp = new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime());
        Date date = new Date();
        String timestamp = "Snapshot_" + date.toString().replaceAll(":", "_");
        File screenshot = new File("src/test/resources/snapshots/" + timestamp + ".jpeg");
        FileUtils.copyFile(file, screenshot);
    }

    @Then("Take a screenshot with <thisName>")
    public void takeAScreenshotWithThisName(DataTable dataTable) throws IOException {
        List<String> data = dataTable.row(0);
        File file = ((TakesScreenshot) Driver.driver).getScreenshotAs(OutputType.FILE);
        Date date = new Date();
        String timestamp = data.get(0) + "_" + date.toString().replaceAll(":", "_");
        File screenshot = new File("src/test/resources/snapshots/" + timestamp + ".jpeg");
        FileUtils.copyFile(file, screenshot);
    }
}
