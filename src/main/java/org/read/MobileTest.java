package org.read;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest{
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability("deviceName", "Galaxy M20");
		des.setCapability("platformName", "Android");
		des.setCapability("platformVersion", "10");
		des.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		des.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		URL ul=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(ul,des);
		
		MobileElement firstbtn = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
		firstbtn.click();
		
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add")).click();
		
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02")).click();
		
		MobileElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
		   System.out.println(equal.getText()); 
		MobileElement equalbtn = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
		equalbtn.click();
		
		MobileElement getvalue = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
		
		String text = getvalue.getText();
		System.out.println(text);
		
	}

}
