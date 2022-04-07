package com.Utility;

import org.openqa.selenium.WebElement;

public class Library {
	public static void custom_sendKeys(WebElement element,String value) {
		try {
			if (element.isEnabled()==true)
			element.sendKeys(value);
			System.out.println("value successfuly send");
		}
		catch(Exception e) {
			System.out.println("unable to send value"+e);
		}
	}
	public static void custom_click(WebElement element) {
		try {
			if (element.isDisplayed() && element.isEnabled())
			element.click();
			System.out.println("click sucesfully");
		}
		catch(Exception e) {
			System.out.println("unable to click"+e);
		}
	}

}
