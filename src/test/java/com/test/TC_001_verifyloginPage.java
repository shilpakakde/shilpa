package com.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class TC_001_verifyloginPage extends BaseClass {
	 @Test
	public void TC_001_verifyFBloginTest_Invaliddata() {
		
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_sendKeys(login.gettxt_emailid(), "shilpa");
		Library.custom_sendKeys(login.gettxt_password(),"123456");
		Library.custom_click(login.getbtn_login());
		
		
	}
	
	
		
	

}
