package Shadow_DOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ShadowDOMDemo {

	public static void main(String[] args) {
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/shadowdom");
		
		JavascriptExecutor js = (JavascriptExecutor) wd;
		
		WebElement w = (WebElement) js.executeScript("return document.querySelector('my-paragraph').shadowRoot.querySelector('p')");
		
		String s = w.getText();
		
		System.out.println(s);

	}

}
