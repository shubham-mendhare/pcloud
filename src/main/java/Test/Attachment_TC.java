package Test;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import utility.OtherUtility;

public class Attachment_TC {
	
	public static void Attachment(WebDriver driver) throws Exception {
		
		 OtherUtility.click(driver, By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/div[3]/div[3]/div[1]"), 60).click();
		 
		 Thread.sleep(3000);
		 
		Boolean flag= OtherUtility.click(driver, By.xpath("/html/body/div[7]"), 20).isDisplayed();
	//	System.out.println(flag);
		if(flag) {
			 OtherUtility.click(driver, By.xpath("/html/body/div[7]"), 20).click();
			 OtherUtility.click(driver, By.xpath("/html/body/div[7]/div[1]/div[3]/div[2]/div[1]/div"), 10).click();
		 
		 	Robot rb = new Robot();
		 
		    // copying File path to Clipboard
		    StringSelection str = new StringSelection("/home/developers/Downloads/images (20).png");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 
		     // press Contol+V for pasting
		     rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_V);
		 
		    // release Contol+V for pasting
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		 
		    // for pressing and releasing Enter
		    rb.keyPress(KeyEvent.VK_ENTER);
		    rb.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 Thread.sleep(3000);
		}
		
	}

}
