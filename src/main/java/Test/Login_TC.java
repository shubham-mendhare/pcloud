package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.ExcelUtils;
import utility.OtherUtility;

public class Login_TC {
	
	public static void Login(WebDriver driver) throws Exception {
		
		 String sUserName = ExcelUtils.getCellData(1, 0);
		 System.out.println("Username is:-"+sUserName);
		 
		 String sPassword = ExcelUtils.getCellData(1, 1);
		 System.out.println("Password is:-"+sPassword);
		 
		 Thread.sleep(1000);
		 
		 OtherUtility.click(driver, By.xpath("//*[@id=\"userinfo_wrap\"]/div/div/a"), 20).click();
		 
		 Thread.sleep(3000);
		 
		 OtherUtility.click(driver, By.cssSelector("body > div.g-overlay.popup > div > div > div > div > div > div.form.Login__Wrapper-feEZIe.bOGKLD > input"), 20).sendKeys(sUserName);
		 
		 Thread.sleep(3000);
		 
		 OtherUtility.click(driver, By.cssSelector("body > div.g-overlay.popup > div > div > div > div > div > div.form.Login__Wrapper-feEZIe.bOGKLD > div.FormSharedComponents__InputPassWrapper-kqQtoi.fALrvP > input"), 20).sendKeys(sPassword);
		 
		 Thread.sleep(2000);
		 
		 OtherUtility.click(driver, By.xpath("/html/body/div[16]/div/div/div/div/div/div[1]/div[5]/button"), 20).click();
		 
		
	}

}
