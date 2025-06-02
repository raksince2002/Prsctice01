package Hover;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("http://the-internet.herokuapp.com/hovers");
		
		List<WebElement> l = wd.findElements(By.tagName("img"));
		
		Actions act = new Actions(wd);
		
		for(WebElement i:l) {
			act.moveToElement(i).perform();
		}

	}

}
