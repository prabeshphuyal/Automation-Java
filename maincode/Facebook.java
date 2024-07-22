package maincode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@SuppressWarnings("unused")
public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabe\\eclipse-workspace\\QaClass\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver chromeDriver = new ChromeDriver(options);
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://www.facebook.com/");
		
	    WebElement txt_box_username,txt_box_password,loginButton,logOut,logOutbutton;
//		navLogin = chromeDriver.findElement(By.id("login2"));
//		navLogin.click();
//		Thread.sleep(10000);
		
		txt_box_username = chromeDriver.findElement(By.id("email"));
		txt_box_username.sendKeys("atitphuyal0@gmail.com");
		Thread.sleep(1000);
		
		txt_box_password = chromeDriver.findElement(By.id("pass"));
		txt_box_password.sendKeys("atituyal@098");
		Thread.sleep(1000);
		
		loginButton = chromeDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		loginButton.click();
		Thread.sleep(1000);
		logOut = chromeDriver.findElement(By.xpath("//*[@id=\"mount_0_0_CL\"]/div/div[1]/div/div[2]/div[5]/div[1]/div[2]/span/span/div/div[1]/svg"));
		logOut.click();
		Thread.sleep(10000);
		logOutbutton = chromeDriver.findElement(By.xpath("//*[@id=\":r4o:\"]/div[2]/div[2]/div/div/div/div/div[2]/div[3]/div/div/div"));
		logOutbutton.click();
		Thread.sleep(10000);
		
		
	}

}
