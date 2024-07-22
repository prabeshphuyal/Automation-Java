package maincode;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstDay {

	public static void main(String[] args) {
		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Enter 1 for Chrome, 2 for Firefox and 3 for Edge :");
			int num= myObj.nextInt()
					;
			if(num==1) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabe\\eclipse-workspace\\QaClass\\driver\\chromedriver.exe");
				WebDriver chromeDriver = new ChromeDriver();
				chromeDriver.manage().window().maximize();
				chromeDriver.get("https://bishalkarki.xyz");
			}else if(num==2) {
				System.setProperty("webdriver.Gecko.driver","C:\\Users\\prabe\\eclipse-workspace\\QaClass\\driver\\geckodriver.exe");
				WebDriver firefoxDriver = new FirefoxDriver();
				firefoxDriver.manage().window().maximize();
				firefoxDriver.get("https://bishalkarki.xyz");
			}else if(num==3) {
				System.setProperty("webdriver.Edge.driver","C:\\Users\\prabe\\eclipse-workspace\\QaClass\\driver\\msedgedriver.exe");
				WebDriver edgeDriver = new EdgeDriver();
				edgeDriver.manage().window().maximize();
				edgeDriver.get("https://bishalkarki.xyz");

			}
		}
			
	}
}
