package BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.ie.driver", "D:\\Selenium Training\\Driver\\MicrosoftWebDriver.exe");
			WebDriver driver=new InternetExplorerDriver();
			driver.get("http://google.com");
			System.out.println(driver.getTitle());
			driver.close();
	}

}

