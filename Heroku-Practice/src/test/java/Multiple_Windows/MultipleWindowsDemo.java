package Multiple_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWindowsDemo {
	
	public static void main(String[] args) {
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/windows");
		
		By click_here = By.xpath("(//a[@target='_blank'])[1]");
		
		wd.findElement(click_here).click();
		
		System.out.println(wd.getWindowHandle());
		
		System.out.println(wd.getWindowHandles().toString());
		
	}

}
