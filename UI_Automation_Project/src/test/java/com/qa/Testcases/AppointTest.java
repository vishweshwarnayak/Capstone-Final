package com.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseLayer.BaseClass;
import com.qa.PageLayer.AppointmentSchedulePage;
import com.qa.PageLayer.LoginPage;

public class AppointTest extends BaseClass {

	public AppointTest() throws IOException {
		super();
	}

	@BeforeMethod		//action to perform before test execution
	public void beforeTest() throws IOException, InterruptedException {
		setup();		//method from base class to initilize browser
		Thread.sleep(500);
	}

	@Test	//actual test
	public void validateAppointment() throws Exception {	//method to check the functionality
		LoginPage login = new LoginPage();
		login.login1();		//method from loginpage to test
		AppointmentSchedulePage ap = new AppointmentSchedulePage();
		ap.appoint();		//method from appointmentpage to test
	}

	@AfterMethod		//actions after test completion
	public void afterTest() {
		tearDown();
	}
}
