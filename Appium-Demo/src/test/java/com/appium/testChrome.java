package com.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class testChrome {

	public static void main(String[] args) throws MalformedURLException {
		//AndroidDriver<WebElement> driver = null;
		
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			
			cap.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
			
			cap.setCapability("chromeOptions",ImmutableMap.of("w3c",false));
			
			//driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
			
			AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			driver.get("https://google.com");
			
		

	}

}
