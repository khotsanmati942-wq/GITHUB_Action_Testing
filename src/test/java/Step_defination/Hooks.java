package Step_defination;
import Base.Test_Base;
import Web_Pages.Account_Page;
import Web_Pages.Home_Page;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Hooks extends Test_Base {


    @Before
    public void setUp() {
        setDriver();
        launchApplication();
    }

    @After
    public void tearDown() {
        quitDriver();
    }
    @AfterStep
    public void addScreenshot(Scenario scenario) {
        WebDriver driver = Test_Base.getDriver();
        if (driver == null) return;
        try {
            // fetch driver instance

            // Folder where screenshots will be saved
            String screenshotDir = System.getProperty("user.dir") + "/target/screenshots/";
            new File(screenshotDir).mkdirs();

            // Unique screenshot name
            String screenshotName = scenario.getName().replaceAll("[^a-zA-Z0-9]", "_")
                    + "_" + System.currentTimeMillis() + ".png";
            String screenshotPath = screenshotDir + screenshotName;

            // Capture screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(screenshotPath));

            // ✅ Attach to Extent Report (relative path)
            ExtentCucumberAdapter.addTestStepScreenCaptureFromPath("../screenshots/" + screenshotName);

            // (Optional) Attach to Cucumber JSON/HTML report
            byte[] fileContent = FileUtils.readFileToByteArray(new File(screenshotPath));
            scenario.attach(fileContent, "image/png", "screenshot");

        } catch (Exception e) {
            System.out.println("Error capturing screenshot: " + e.getMessage());
        }

    }
}

