package maincode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitly {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabe\\eclipse-workspace\\QaClass\\driver\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://demoblaze.com/index.html");
		
	    WebElement navLogin,txt_box_username,txt_box_password,loginButton;
		navLogin = chromeDriver.findElement(By.id("login2"));
		navLogin.click();
//		Thread.sleep(10000);
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		txt_box_username = chromeDriver.findElement(By.id("loginusername"));
		txt_box_username.sendKeys("testmorning");
		
		txt_box_password = chromeDriver.findElement(By.id("loginpassword"));
		txt_box_password.sendKeys("test123");
		
		loginButton = chromeDriver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		loginButton.click();
		
	}

}



