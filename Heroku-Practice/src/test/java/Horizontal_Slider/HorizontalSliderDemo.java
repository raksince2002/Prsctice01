package Horizontal_Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/horizontal_slider");
		
		WebElement w = wd.findElement(By.xpath("//input[@type='range']"));
		
		Actions act = new Actions(wd);
		
		act.dragAndDropBy(w, 0, 1).perform();

	}

}
