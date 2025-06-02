package JS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement w = wd.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		
		w.click();
		
		Alert alert = wd.switchTo().alert();
		
		alert.sendKeys("Hello");
		
		alert.accept();
		
	}

}
