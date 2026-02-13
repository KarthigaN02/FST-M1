package examples;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class AppiumActivity1 {

    // Driver Declaration
    AndroidDriver driver;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {

        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setApp("path/to/calculator.apk");   // Update with actual APK path
        options.noReset();

        // Server Address
        URL serverURL = new URI("http://localhost:4723").toURL();

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
    }

    // Test method demonstrating 3 basic locators
    @Test
    public void multiplyTest() {

        // 1️⃣ ID Locator
        driver.findElement(AppiumBy.id("digit_5")).click();

        // 2️⃣ Accessibility ID Locator
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();

        // ID Locator again
        driver.findElement(AppiumBy.id("digit_8")).click();

        // Accessibility ID again
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // 3️⃣ XPath Locator
        String result = driver.findElement(
                AppiumBy.xpath("//*[@resource-id='result_final']")
        ).getText();

        // Assertion
        Assert.assertEquals(result, "40");
    }

    // Tear down method
    @AfterClass
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
