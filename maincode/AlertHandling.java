package maincode;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class AlertHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabe\\eclipse-workspace\\QaClass\\driver\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement simpleNav, Button1, confirmNav, Button2, txtBoxNav, Button3;
		simpleNav = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		simpleNav.click();
		Button1= chromeDriver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		Button1.click();
		Thread.sleep(5000);
		Alert art = chromeDriver.switchTo().alert();
		art.accept();
		
		confirmNav = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		confirmNav.click();
		Button2 = chromeDriver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		Button2.click();
		Thread.sleep(5000);
		art.dismiss();
		
		txtBoxNav = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		txtBoxNav.click();
		Button3 = chromeDriver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		Button3.click();
		Thread.sleep(5000);
		
		art.sendKeys("qaclass");
		art.accept();
		
		
		
	}
}
	
