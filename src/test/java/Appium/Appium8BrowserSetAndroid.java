package Appium;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en_lol.AN;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Appium8BrowserSetAndroid {
    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("userName", "ilknuryilmaz_zalLQI");
        capabilities.setCapability("accessKey", "qqrcrrkomgVCU1RPx5U");
        capabilities.setCapability("framework", "testng");
        capabilities.setCapability("app", "bs://sample.app");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("deviceName", "Samsung Galaxy A10");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("project", "First Java Project");
        capabilities.setCapability("build", "browserstack-build-1");
        capabilities.setCapability("name", "first_test");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("htpps://hub.browserstack.com/wd/hub"), capabilities);
        AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Search Wikipedia")));
        searchElement.click();
        AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("org.wikipedia.alpha:id/search_src_text")));
        insertTextElement.sendKeys("BrowserStack");
        Thread.sleep(5000);
        List<AndroidElement> allproductName = (List<AndroidElement>) driver.findElementByClassName("android.widget.TextView");
        assert (allproductName.size() > 0);

        /*
        userName: ilknuryilmaz_zalLQI
accessKey: qqrcrrkomgVCU1RPx5Ub
framework: testng
app: bs://sample.app
platforms:
  - platformName: android
    deviceName: Samsung Galaxy A10
    platformVersion: 9.0
  - platformName: android
    deviceName: Google Pixel 7 Pro
    platformVersion: 13.0
  - platformName: android
    deviceName: OnePlus 9
    platformVersion: 11.0
         */


    }
}
