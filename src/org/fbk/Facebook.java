package org.fbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\eclipse\\MavenPrjt\\Facebook\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("www.facebook.com");
		
		driver.getTitle();
		
		
		
	}

}
