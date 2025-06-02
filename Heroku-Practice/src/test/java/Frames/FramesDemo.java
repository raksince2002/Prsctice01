package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/nested_frames");
		
		wd.switchTo().frame("frame-top");
		
		wd.switchTo().frame("frame-left");
		
		System.out.println(wd.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText());
		
		wd.switchTo().defaultContent();
		
		wd.switchTo().frame("frame-top");
		
		wd.switchTo().frame("frame-middle");
		
		System.out.println(wd.findElement(By.xpath("//body/div[@id='content']")).getText());
		

	}

}
