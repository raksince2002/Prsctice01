package Entry_Ad;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdDemo {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/entry_ad");
		
		WebElement w = wd.findElement(By.xpath("//p[contains(text(),'Close')]"));	
		
		WebDriverWait ww = new WebDriverWait(wd,Duration.ofSeconds(10));
		
		ww.until(ExpectedConditions.visibilityOf(w)).click();
		
	}
	
}
