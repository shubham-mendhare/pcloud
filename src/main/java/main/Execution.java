package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Test.Attachment_TC;
import Test.Login_TC;
import testData.Constant;
import utility.ExcelUtils;

public class Execution {
	public static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 ExcelUtils.setExcelFile(Constant.Path_TestData,"Inputs");
		 
		 	System.setProperty("webdriver.chrome.driver", "/home/developers/Downloads/chromedriver_linux64 (3)/chromedriver");
			driver =new ChromeDriver();	
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get(Constant.URL);
			Login_TC.Login(driver);
			Attachment_TC.Attachment(driver);

	}

}
