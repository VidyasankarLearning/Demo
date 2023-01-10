package AppiumVss;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import appium.Method;
import io.appium.java_client.AppiumBy;


public class AppiumBasics extends PreRequisites{

	@Test
	public void AppiumTest() throws MalformedURLException
	{
		
		//Your Automation code comes here
		//xpath, id, accessibilityId, classname, androidUIAutomator -> Locators
		
		//MobileConfig(); //-> Use this if we wanted to run without TestNG
		//declare before and after class in PreRequisites to avoid declaring the methods here
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		wifiSetting();
		//driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		//String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		//Assert.assertEquals(alertTitle, "WiFi settings");
		//driver.findElement(By.id("android:id/edit")).sendKeys("Thrushyan");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(0).click();
		wifiSetting();
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		
		//Use "AppiumBy" for accessibilityId and classname instead of "By". Safe purpose (Reason TBD)
		//if "id" is unavailable and xpath is complex, can use classname method with "class" details and its index (.get(index)).
		//if "id" is unavailable and xpath is complex, can use xpath method with "class" details and the [position#] of the same
		
		//tearDown(); //-> Use this if we wanted to run without TestNG
	}

	
}
