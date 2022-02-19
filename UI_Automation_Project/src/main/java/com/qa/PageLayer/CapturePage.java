package com.qa.PageLayer;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.qa.BaseLayer.BaseClass;

public class CapturePage extends BaseClass {
	public CapturePage() throws IOException {
		super();
	}

	public void capture1() throws InterruptedException {
		WebElement capture_vitals = driver.findElement(By.xpath(prop.getProperty("capture_vitals_path")));
		capture_vitals.click();		//click on capture vitals option
		Thread.sleep(500);

		WebElement search = driver.findElement(By.xpath(prop.getProperty("search_path")));
		search.sendKeys("1002KL");		//to search for patient
		search.sendKeys(Keys.ENTER);	//to perform action like click on ENTER button
		Thread.sleep(500);

		WebElement patient_ID = driver.findElement(By.xpath(prop.getProperty("patient_ID_path")));
		String ID1 = patient_ID.getText();		
		System.out.println(ID1);
		Assert.assertEquals(prop.getProperty("ID"), ID1);	//checking if patient ID is same as expected

	}
}
