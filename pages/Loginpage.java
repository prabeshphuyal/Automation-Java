package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By txt_username = By.id("loginusername");
	
	public void enterUsername(String Username) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(txt_username).sendKeys(Username);
		
	}
	
	By txt_passsword = By.id("loginpassword");
	
	public void enterPassword(String Password) {
		driver.findElement(txt_passsword).sendKeys(Password);
		
	}
	
	By loginButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
	
	public void clickLogin() {
		
		driver.findElement(loginButton).click();
	}
	
	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
		
	}

}
