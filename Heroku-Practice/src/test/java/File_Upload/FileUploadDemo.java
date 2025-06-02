package File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadDemo {
	
	public static void main(String[] args) {
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/upload");
		
		By upload = By.id("file-upload");
		By submit = By.id("file-submit");
		
		wd.findElement(upload).sendKeys("C:\\Users\\Rakesh\\Downloads\\random_data.txt");
		
		wd.findElement(submit).click();
		
		
	}

}
