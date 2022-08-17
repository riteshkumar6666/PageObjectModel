package com.fb.qa.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class LoginPage extends TestBase {
	//page factory - or:
			@FindBy(name = "email")
			WebElement username;
			
			@FindBy(name = "pass")
			WebElement password;
			
			@FindBy(xpath = "//button[@type='submit']")
			WebElement loginBtn;
			
			//@FindBy(xpath = "//a[text()='Create New Account']']")
		//	WebElement CreateAccountbtn;
			
			//Initialize page objects
			public LoginPage() {
				PageFactory.initElements(driver, this);		
			}
			//Actions
			public String validatLoginPageTitle() {
				return driver.getTitle();
			}
			
			public HomePage login(String uname, String pwd) {
				username.sendKeys(uname);
				password.sendKeys(pwd);
				loginBtn.click();
				
				return new HomePage();
			}
//			public void loginMutipleAccounts(String title,String username2, String password2) {
//				Select select = new Select(driver.findElement(By.name("title")));
//				select.selectByVisibleText(title);
//				username.sendKeys(username2);
//				password.sendKeys(password2);
//				loginBtn.click();
//				
//			}
			
}
