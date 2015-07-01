package com.jenkinsintegration.appium;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {
	
	@Test
	public  void testPicker() throws MalformedURLException, InterruptedException {
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
//		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
//		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
////		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Loading");
//		cap.setCapability("udid", "2e937288fcf6456d5fa37c78600949ed704ff128");
//		cap.setCapability("app", "com.example.apple-samplecode.UICatalog");
//		cap.setCapability("noreset", true);
//
//		IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
//		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
//		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, System.getProperty("PlatformName"));
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, System.getProperty("PlatformVersion"));

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
		
		cap.setCapability("app", "/Users/lyw/Library/Developer/Xcode/DerivedData/UICatalog-ctuvkgjkjeikvchcoichpbfuhsrz/Build/Products/Debug-iphonesimulator/UICatalog.app");

//		File app = new File(System.getProperty("user.dir")+"//apps/UICatalog.app");
//		cap.setCapability("app", app.getAbsolutePath());
		IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		

		driver.scrollTo("Date Picker").click();
//		System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(0).getAttribute("values"));
//		System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(1).getAttribute("values"));
//		System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(2).getAttribute("values"));
//		System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(3).getAttribute("values"));

		driver.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Jul 15");
		driver.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("16");
		driver.findElements(By.className("UIAPickerWheel")).get(2).sendKeys("30");
//
		driver.findElements(By.className("UIAPickerWheel")).get(3).sendKeys("AM"); 

		
		

		Thread.sleep(10000);
		driver.quit();
	}

}
