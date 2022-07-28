package testScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinPopupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
//		Open a new window 
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.selenium.dev/");
		Set<String> wins = driver.getWindowHandles();
		System.out.println("No. of Windows : " + wins.size());
		
//		Iterate through windows
		Iterator<String> it = wins.iterator();
		String gWindow = it.next();
		String sWindow = it.next();
		System.out.println(driver.getTitle());
		
		
//		Switch to Google Window
		driver.switchTo().window(gWindow);
		System.out.println(driver.getTitle());
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Java Tutorial");
		search.submit();
		System.out.println("Page Title : " + driver.getTitle());
		
		driver.switchTo().window(sWindow);
		driver.findElement(By.xpath("//ul[@class ='navbar-nav mr-4 mb-2 mb-lg-0 pl-4 pl-lg-2']//following::li[2]")).click();
		System.out.println("Page title is :" + driver.getTitle());
		
		
	
		
//		Switch to a new window and open
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.navigate().to("https://playwright.dev/");
//		System.out.println(driver.getTitle());
//		driver.close();
//		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
