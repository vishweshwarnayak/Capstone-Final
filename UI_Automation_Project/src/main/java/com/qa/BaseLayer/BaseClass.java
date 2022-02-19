package com.qa.BaseLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {	//base class contains all the methods that dont change during process
	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() throws IOException {

		prop = new Properties();	//new object of properties class
		FileInputStream fis = new FileInputStream("./Configurations\\Config.properties");	//to access config file 
		prop.load(fis);
	}

	public static void setup() {
		String browserName = prop.getProperty("browser");	//to chose between browsers

		if (browserName.equals("chrome")) {		//for Chrome browser
			System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("edge")) {	//for Edge browser

			System.setProperty("webdriver.edge.driver", "./Drivers//msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();	//browser window maximize
		driver.manage().deleteAllCookies();		//delete all cookies
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	//wait for 10 seconds
		driver.get(prop.getProperty("TestUrl"));

	}

	public void tearDown() {
		driver.close();		//to close the browser window
		System.out.println("Driver closed");
		// driver.quit();
		//System.out.println("Driver quit");
	}
}
