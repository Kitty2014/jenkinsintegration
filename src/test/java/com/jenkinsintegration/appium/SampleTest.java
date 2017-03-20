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
				
//		DesiredCapabilities cap = new DesiredCapabilities();
		
		
//		desired_caps['newCommandTimeout'] = 300
	
//		desired_caps['xcodeConfigFile'] = os.path.abspath('/Users/uxin/TestWA/testwa.xcodeconfig')
//		desired_caps['deviceName'] = 'iPhone 6s'
//		desired_caps['app'] = os.path.abspath('/Users/uxin/Library/Developer/Xcode/DerivedData/UICatalog-glqzxkxukgbgdsdkifgoxumcfmlj/Build/Products/Debug-iphonesimulator/UICatalog.app')
		
		
		
/*		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
//		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
//		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, System.getProperty("PlatformName"));
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, System.getProperty("PlatformVersion"));

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6s");
//		/Applications/Xcode.app/Contents/Developer/Applications/Simulator.app --args -CurrentDeviceUDID  30A7FA49-673F-4F44-84EC-BF3D08445824
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
		cap.setCapability("udid","30A7FA49-673F-4F44-84EC-BF3D08445824");
//		capabilities.setCapability("udid",Test_UUID);
		cap.setCapability("app", "/Users/uxin/Library/Developer/Xcode/DerivedData/UICatalog-glqzxkxukgbgdsdkifgoxumcfmlj/Build/Products/Debug-iphonesimulator/UICatalog.app");

//		File app = new File(System.getProperty("user.dir")+"//apps/UICatalog.app");
//		cap.setCapability("app", app.getAbsolutePath());
		*/
		
		 DesiredCapabilities cap = new DesiredCapabilities();
	 		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	 		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
	 		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3.5");
	 		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
	 		cap.setCapability("udid", "1851e96c01d50f6fbc2032a31a4e903181cdc159");
//	 		cap.setCapability("udid", "d4fd7d4e418906f9258cc13c000507b97d9848d9");
//	 		cap.setCapability("udid", "426b40037e3920fb5c44c981694f415b113d2e2f");---
//	 		cap.setCapability("app", "com.facebook.IntegrationApp");
//	 		cap.setCapability("app", "com.lubaocar.checkauto3auto");
	 		
	 		cap.setCapability("app", "com.DTC.UICatalog");
	 		
	 		
		    cap.setCapability("noReset", true);
		    cap.setCapability("newCommandTimeout", 0);
		    cap.setCapability("session-override", true);
//		    cap.setCapability("preventWDAAttachments", true);
		    
		    
		IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		

		driver.scrollTo("Date Picker").click();
//		System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(0).getAttribute("values"));
//		System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(1).getAttribute("values"));
//		System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(2).getAttribute("values"));
//		System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(3).getAttribute("values"));

		driver.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Thu, Mar 23");
		driver.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("10");
		driver.findElements(By.className("UIAPickerWheel")).get(2).sendKeys("10");
//
		driver.findElements(By.className("UIAPickerWheel")).get(3).sendKeys("AM"); 

		
		

		Thread.sleep(10000);
		driver.quit();
	}

}
