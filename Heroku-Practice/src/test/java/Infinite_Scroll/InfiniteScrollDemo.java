package Infinite_Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InfiniteScrollDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/infinite_scroll");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) wd;
		
		while(true) {			
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}
		
	}

}
