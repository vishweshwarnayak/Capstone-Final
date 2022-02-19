package com.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseLayer.BaseClass;
import com.qa.PageLayer.DashboardPage;
import com.qa.PageLayer.LoginPage;

public class DashboardTest extends BaseClass {
	public DashboardTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void beforeTest() throws IOException, InterruptedException {
		setup();		//method from base class to initilize browser
		Thread.sleep(500);
	}

	@Test
	public void validateDashboard() throws Exception {
		LoginPage login = new LoginPage();
		login.login1();		//method from loginpage to test
		DashboardPage dash = new DashboardPage();
		dash.textDisplay();	//method from dashboardpage to test
	}

	@AfterMethod		//actions after test completion
	public void afterTest() {
		tearDown();
	}
}
