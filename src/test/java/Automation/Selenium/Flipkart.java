package Automation.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Flipkart {

	WebDriver driverChrome;
	@Test
	public void browser() {
		
		String path=System.getProperty("user.dir");
		String genericPathChrome=path+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", genericPathChrome);
		driverChrome= new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverChrome.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driverChrome.manage().deleteAllCookies();
		
		
	}
	@Test
	public void cart() throws InterruptedException {
		
		driverChrome.get("https://www.flipkart.com");
		driverChrome.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("9028055581");
		driverChrome.findElement(By.xpath("(//input[@type=\"text\"])[2]")).clear();
		Thread.sleep(10000);
		driverChrome.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("pavan2205");
		driverChrome.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		/*Thread.sleep(5000);
		driverChrome.findElement(By.xpath("//a[@class=\"_3ko_Ud\"]")).click();
		Thread.sleep(5000);*/
		
	}
	
	@Test
	public void sikuliMethod() throws FindFailed, InterruptedException {
		
		Screen screen= new Screen();
		Pattern searchBox= new Pattern("C:\\Users\\Ankush\\Desktop\\Selenium Data\\doc\\searchBox.PNG");
		screen.type(searchBox, "Book");
		
		screen.click(searchBox);
		
		Thread.sleep(5000);
		
	}
		
		
	@AfterTest
	public void closeBrowser() {
		
		driverChrome.close();
		driverChrome.quit();
	}
	
	
	/*@Test
	public static void main(String[] args) throws InterruptedException, FindFailed {
		Flipkart flip= new Flipkart();
		flip.browser();
		flip.cart();
		flip.sikuliMethod();
		

	}
*/
}
