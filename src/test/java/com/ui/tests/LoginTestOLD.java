package com.ui.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.utility.BrowserUtility;

public class LoginTestOLD {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver(); //launch a browser window // Browser Session is created
		
		BrowserUtility browserUtility = new BrowserUtility(wd);
		browserUtility.goToWebsite("http://automationpractice.pl");
		browserUtility.maximizeWindow();
		
		By signInLinkLocator = By.xpath("//a[contains(text(),\"Sign\")]");
		browserUtility.clickOn(signInLinkLocator);
		
		By emailTextBoxLocator = By.id("email");
		browserUtility.enterText(emailTextBoxLocator, "limik73736@halbov.com");
		
		By passwordTextBoxLocator = By.id("passwd");
		browserUtility.enterText(passwordTextBoxLocator, "password");
		
		By submitLoginButtonLocator = By.id("SubmitLogin");
		browserUtility.clickOn(submitLoginButtonLocator);
		
	}

}
