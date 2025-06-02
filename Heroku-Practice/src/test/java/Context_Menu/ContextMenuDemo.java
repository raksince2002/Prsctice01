package Context_Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/context_menu");
		
		Actions act = new Actions(wd);
		
		WebElement w = wd.findElement(By.id("hot-spot"));
		
		act.contextClick(w).perform();
		
		wd.switchTo().alert().accept();

	}

}
