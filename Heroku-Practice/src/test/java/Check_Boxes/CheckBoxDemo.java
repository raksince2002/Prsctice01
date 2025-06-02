package Check_Boxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/checkboxes");
		
		By checkbox1 = By.xpath("(//input[@type='checkbox'])[1]");
		By checkbox2 = By.xpath("(//input[@type='checkbox'])[2]");
		
		wd.findElement(checkbox1).click();
		wd.findElement(checkbox1).click();
		wd.findElement(checkbox2).click();
		
	}

}
