package Exit_Intent;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExitIntentDemo {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/exit_intent");
		
		WebElement w = wd.findElement(By.xpath("//p[contains(text(),'Close')]"));	
		
		Robot r = new Robot();
		
		r.delay(3000);
		
		r.mouseMove(0, 10);
		
		WebDriverWait ww = new WebDriverWait(wd,Duration.ofSeconds(10));
		
		ww.until(ExpectedConditions.visibilityOf(w)).click();

	}

}
