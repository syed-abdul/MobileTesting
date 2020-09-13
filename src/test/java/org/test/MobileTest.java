package org.test;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class MobileTest extends Base{
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability("deviceName", "Galaxy M20");
		des.setCapability("platformName", "Android");
		des.setCapability("platformVersion", "10");
		des.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		des.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		
		URL ul=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(ul,des);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridLayout/android.widget.ImageView[1]")).click();
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();
		MobileElement btn = driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text"));
		
		btn.sendKeys("iphone");
	KeyEvent k=new KeyEvent(AndroidKey.ENTER);
		driver.pressKey(k);
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[4]")).click();
	
		List<MobileElement> allow1 = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"));
		
		if(isElementPresent(allow1)) {
			allow1.get(0).click();
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		
			
		}
			Dimension si = driver.manage().window().getSize();
			
		Double sh = si.getHeight() * 0.5;
			Double eh = si.getHeight() * 0.2;
		
		int start = sh.intValue();
		int ends = sh.intValue();
		
		TouchAction ta=new TouchAction(driver);
		
		Thread.sleep(4000);
		ta.press(PointOption.point(0, start))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10))).moveTo(PointOption.point(0, ends)).release().perform();
		//Thread.sleep(5000);
		//ta.press(PointOption.point(0, start))
		//.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10))).moveTo(PointOption.point(0, ends)).release().perform();
		//Thread.sleep(5000);
		//ta.press(PointOption.point(0, start))
		//.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10))).moveTo(PointOption.point(0, ends)).release().perform();
		
		
		
		
}
}