package Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumUiSelector5 {
    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "C:/Users/fylmz/IdeaProjects/MobileTest/src/Apps/gesture-tool.apk");
        capabilities.setCapability("appPackage", " cm.aptoide.pt");
        capabilities.setCapability("appActivity", "cm.aptoide.pt.view.MainActivity");
        capabilities.setCapability("noReset", true);//aplication un izinlzri sormadan acilmasini istiyorsak bunu yukleriz
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"cm.aptoide.pt:id/refresh_layout\")").click();
        String enabled = driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"cm.aptoide.pt:id/refresh_layout\").enabled(true)").getAttribute("enabled");
        Assert.assertEquals(enabled,"true");
        driver.closeApp();
    }
}