package Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium01 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("platformName","Android");Seleniumdan
        //capabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");Appiumdan
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "C:/Users/fylmz/IdeaProjects/MobileTest/src/Apps/apiDemos.apk");
        capabilities.setCapability("appPackage","com.touchboarder.android.api.demos");
        capabilities.setCapability("appActivity","com.touchboarder.androidapidemos.MainActivity");
        capabilities.setCapability("noReset",true);//aplication un izinlzri sormadan acilmasini istiyorsak bunu yukleriz
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
        Thread.sleep(5000);
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        Thread.sleep(5000);
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        Thread.sleep(5000);
        driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElementById("android:id/alertTitle").isDisplayed());
        Thread.sleep(5000);
        driver.findElementById("android:id/edit").sendKeys("TextAppium");
        Thread.sleep(5000);
        driver.findElementById("tandroid:id/button1").click();


        driver.closeApp();


    }
}
