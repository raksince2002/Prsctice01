package JQuery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://jqueryui.com/draggable/");
		
		wd.switchTo().frame(0);
		
		Actions act = new Actions(wd);
		
		WebElement w = wd.findElement(By.id("draggable"));
		
//		act.clickAndHold(w).moveByOffset(100, 100).perform();
		
//		act.dragAndDropBy(w, 100, 100).perform();
		
		

	}

}
