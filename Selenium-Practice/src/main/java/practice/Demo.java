package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
//		wd.get("https://www.google.com/");
		
		URL url = new URL("https://the-internet.herokuapp.com/javascript_alerts");
		
		wd.navigate().to(url);
		
		wd.manage().window().maximize();
		
		WebElement we = wd.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		
		we.click();
		
		WebDriverWait wait = new WebDriverWait(wd,Duration.ofSeconds(10));
		
		Alert ale = wait.until(ExpectedConditions.alertIsPresent());
		ale.sendKeys("Ok");
		
		Thread.sleep(2000);
		
		ale.accept();
		
		

	}

}
