package Appium;

import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appium2 {
    @Test
    public void test(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("platformName","Android");Seleniumdan
        //capabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");Appiumdan
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "C:/Users/fylmz/IdeaProjects/MobileTest/src/Apps/com.google.android.calculator_78000303_apps.evozi.com.apk");

    }
}
