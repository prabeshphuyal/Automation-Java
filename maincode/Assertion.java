package maincode;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assertion {
	WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement navLogin,txt_box_username,txt_box_password,loginButton;
		try {
			navLogin = driver.findElement(By.id("login2"));
			navLogin.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			txt_box_username = driver.findElement(By.id("loginusername"));
			txt_box_username.sendKeys("testmorning");
			
			txt_box_password =driver.findElement(By.id("loginpassword"));
			txt_box_password.sendKeys("test123");
			
			loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
			loginButton.click();
			Thread.sleep(5000);
			String ExpectedResult = "Welcome testmorning";
			String ActualResult = driver.findElement(By.id("nameofuser")).getText();
			Assert.assertEquals(ActualResult, ExpectedResult, "This is not same User.");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabe\\eclipse-workspace\\QaClass\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoblaze.com/index.html");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
