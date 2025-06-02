package Drag_And_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		By column1 = By.id("column-a");
		By column2 = By.id("column-b");
		
		WebElement w1 = wd.findElement(column1);
		WebElement w2 = wd.findElement(column2);
		
		Actions act = new Actions(wd);
		
		act.dragAndDrop(w1, w2).perform();
		

	}

}
