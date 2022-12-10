package com.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Okxe {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Appium");
		
		cap.setCapability("appPackage", "com.okxe.app");
		
		cap.setCapability("appActivity", "com.android.okxe.Okxe");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, cap);
		
//		WebElement seven =  driver.findElementById("com.google.android.calculator:id/digit_7"); //find 7
//		seven.click();
//		
//		driver.findElementById("com.google.android.calculator:id/op_add").click(); //find add
//		
//		WebElement three =  driver.findElementById("com.google.android.calculator:id/digit_3"); //find 7
//		three.click();
		
		
//		
//		driver.findElementById("com.google.android.calculator:id/eq").click();
		
		
		
	}

}
