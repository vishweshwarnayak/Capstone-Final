package com.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseLayer.BaseClass;
import com.qa.PageLayer.LoginPage;

public class LoginTest extends BaseClass {

	public LoginTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void beforeTest() throws IOException, InterruptedException {
		setup();		//method from base class to initilize browser
		Thread.sleep(500);
	}

	@Test
	public void validateLogin() throws Exception {
		LoginPage login = new LoginPage();
		login.login1();		//method from loginpage to test
	}

	@AfterMethod		//actions after test completion
	public void afterTest() {
		tearDown();
	}
}
