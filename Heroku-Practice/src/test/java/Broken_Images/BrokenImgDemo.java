package Broken_Images;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenImgDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/broken_images");
		
		String imgs = "//div[@class='example']/child::img";
		
		List<WebElement> l = wd.findElements(By.xpath(imgs));
		
		for(WebElement i:l) {
			if(i.getAttribute("naturalWidth").equals("0")) {
				System.out.println("Broken img");
			}
			else {
				System.out.println("Not a broken img");
			}
		}
		

	}

}
