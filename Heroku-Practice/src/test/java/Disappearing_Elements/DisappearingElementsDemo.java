package Disappearing_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DisappearingElementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/disappearing_elements");
		
		wd.findElement(By.xpath("//a[@href='/']")).click();
		
		wd.navigate().back();

	}

}
