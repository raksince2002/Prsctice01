package AddAndDelete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AddAndDeleteDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/add_remove_elements/");
		
		JavascriptExecutor js = (JavascriptExecutor) wd;
		
		By add = By.xpath("//button[@onclick='addElement()']");
		By elements = By.xpath("//div[@id='elements']/child::*");
		
		for(int i=0;i<3;i++) {
			WebElement w = wd.findElement(add);
			js.executeScript("arguments[0].click()", w);
		}
				
		List<WebElement> l = wd.findElements(elements);
		
		for(WebElement i:l) {
			js.executeScript("arguments[0].click()", i);
			System.out.println("Deleted");
		}
		
		

	}

}
