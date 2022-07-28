package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JSExecTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String str = (String)js.executeScript("return document.title");
		System.out.println("Page Title : " +str);
		WebElement searchbox = (WebElement) js.executeScript("return document.getElementsByName('search')[0]");
		searchbox.sendKeys("phone");
		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav li.nav-item.dropdown:nth-child(3)"));
		WebElement menuItem = driver.findElement(By.xpath("//a[contains(text(),  'Monitors')]"));
		act.moveToElement(menu).click(menuItem).perform();
//		Move backward
		js.executeScript("history.go(-1)");
//		Move forward
		js.executeScript("history.go(1)");
//		SCroll to a position with x axis and y axis value
		js.executeScript("window.scrollBy(10,700)");
//		Scroll to a position with x axis known but y axis not known
		js.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		
//		Enter the date in a disabled field using javascriptor
		driver.get("http://demo.automationtesting.in/Datepicker.html");
//		driver.findElement(By.id("datepicker1")).sendKeys("07/25/2022");
		js.executeScript("document.querySelector('#datepicker1').value='07/25/2022'");
		
		


	}

}
