package com.ui.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import com.utility.BrowserUtility;

public class LoginTest2 {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver(); //launch a browser window // Browser Session is created
		HomePage homePage = new HomePage(wd);
	//	homePage.goToLoginPage();
		LoginPage loginPage = homePage.goToLoginPage();
		loginPage.doLoginWith("limik73736@halbov.com", "password");
		
	}

}
