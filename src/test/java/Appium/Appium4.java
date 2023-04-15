package Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class Appium4 {
    @Test
    public void test() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60000);
        capabilities.setCapability("chromedriverExecutable","C:/Users/fylmz/IdeaProjects/MobileTest/src/driver/chromedriver.exe");
        Thread.sleep(5000);
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(5000);
        driver.get("https://www.amazon.com");
        System.out.println(driver.getContext()+"app turu");
        //application un hangi turleri oldugunu gormek icin
        Set<String>butunTurler=driver.getContextHandles();
        for (String tur:butunTurler) {
            System.out.println(tur);
            if (tur.contains("WEBVIEW_chrome")){
                driver.context(tur);
            }

        }

        System.out.println(driver.getContext()+"sonraki tur");
        Thread.sleep(7000);
        MobileElement logo=driver.findElementByXPath("//a[@id='nav-logo-sprites']");
        Assert.assertTrue(logo.isEnabled());
        Thread.sleep(5000);
        MobileElement signin=driver.findElementByXPath("//a[@id='nav-logobar-greeting']");
        signin.click();
        MobileElement signInPage=driver.findElementByXPath("//h2");
        Assert.assertTrue(signInPage.isDisplayed());
        Thread.sleep(5000);


    }
}
