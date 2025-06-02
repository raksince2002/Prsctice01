package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/iframe");
		
		By close = By.xpath("(//button[@tabindex='-1'])[16]");
		
		wd.findElement(close).click();
		
		wd.switchTo().frame("mce_0_ifr");
		
		System.out.println(wd.findElement(By.xpath("//body/p[contains(text(),'Your content goes here.')]")).getText());

	}

}
