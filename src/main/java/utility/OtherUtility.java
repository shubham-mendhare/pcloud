package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OtherUtility {
	
	public static WebElement click (WebDriver driver, By elementLocator, int timeout) {
		//System.out.println(elementLocator);
		WebElement element = new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
		return element;
	}

}
