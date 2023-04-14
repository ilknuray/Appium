package Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium2 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        //capabilities.setCapability("platformName","Android");Seleniumdan
        //capabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");Appiumdan
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //capabilities.setCapability("appPackage","com.touchboarder.android.calculator");
       // capabilities.setCapability("appActivity","com.touchboarder.calculator.MainActivity");
        capabilities.setCapability("noReset",true);
        capabilities.setCapability(MobileCapabilityType.APP, "C:/Users/fylmz/IdeaProjects/MobileTest/src/Apps/Calculator.apk");
        Thread.sleep(5000);
        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(5000);

    }
}
