package Status_Codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StatusCodeDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/status_codes");
		
		JavascriptExecutor js = (JavascriptExecutor) wd;
		
		By codes = By.xpath("//div[@class='example']//ul//a");
		By statusCodes = By.xpath("//a[@href='/status_codes']");
		
		List<WebElement> l = wd.findElements(codes);
		
		for(WebElement i:l) {
			Thread.sleep(3000);
			i.click();
			Thread.sleep(3000);
			wd.navigate().back();
		}

	}

}
