package testcases;

import org.testng.annotations.Test;

import base.BasePage;
import pages.Homepage;
import pages.Loginpage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class New_Test_NG {
	WebDriver dv;
  @Test
  public void f() {
	  Loginpage lp = new Loginpage(dv);
	  lp.login("testmorning", "test123");
  }
  @BeforeTest
  public void bf() {
	  System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	  dv = new ChromeDriver();
	  BasePage bp = new BasePage(dv);
	  bp.startbrowser("https://demoblaze.com");
	  Homepage hp = new Homepage(dv);
	  hp.click_nav_login();
  }

 

}
