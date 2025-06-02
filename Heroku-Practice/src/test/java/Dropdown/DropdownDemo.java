package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
	
	public static void main(String[] args) {
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement w = wd.findElement(By.id("dropdown"));
		
		Select s = new Select(w);
		
		s.selectByVisibleText("Option 1");
		s.selectByVisibleText("Option 2");
		
	}

}
