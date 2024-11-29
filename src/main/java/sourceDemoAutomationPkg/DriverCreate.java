package sourceDemoAutomationPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCreate {
	
	WebDriver driver=new ChromeDriver();
	
	public WebDriver ImportDriverObjMthd() {
		return driver;
	}
	 
}
