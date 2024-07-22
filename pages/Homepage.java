package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;
	public Homepage(WebDriver driver) {
		
		this.driver = driver;
	}
	By navLogin = By.id("login2");
	
	public void click_nav_login() {
		
		driver.findElement(navLogin).click();
	}
	
}
