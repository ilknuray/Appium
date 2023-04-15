package Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium3 {
    @Test
    public void test01() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "C:/Users/fylmz/IdeaProjects/MobileTest/src/Apps/General-Store.apk");
        capabilities.setCapability("appPackage","com.android.chrome");
        capabilities.setCapability("appActivity","org.chromium.chrome.browser.ChromeTabbedActivit");
        capabilities.setCapability("noReset",true);
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        //Thread.sleep(5000);
        MobileElement acceptContinue=driver.findElementById("com.android.chrome:id/terms_accept");
        acceptContinue.click();
        driver.closeApp();
    }
}
