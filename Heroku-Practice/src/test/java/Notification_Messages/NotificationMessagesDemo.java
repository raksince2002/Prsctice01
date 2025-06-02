package Notification_Messages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NotificationMessagesDemo {

	public static void main(String[] args) {
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/notification_message_rendered");
		
		By click_here = By.xpath("//a[contains(text(),'Click here')]");
		
		wd.findElement(click_here).click();
		
		By message = By.xpath("//div[@id='flash']");
		
		String s = wd.findElement(message).getText();
		
		s = s.substring(0,s.length()-2);
		
		while(!s.equals("Action successful")) {
			wd.findElement(click_here).click();
			s = wd.findElement(message).getText();
			s = s.substring(0,s.length()-2);
		}

	}

}
