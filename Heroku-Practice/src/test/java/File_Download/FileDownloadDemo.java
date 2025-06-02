package File_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileDownloadDemo {
	
	public static void main(String[] args) {
		
		WebDriver wd = new EdgeDriver();
		
		wd.get("https://the-internet.herokuapp.com/download");
		
		wd.findElement(By.xpath("(//a)[2]")).click();
		
	}

}
