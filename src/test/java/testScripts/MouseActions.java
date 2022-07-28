package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");

		////		To move and keep Mouse over an element
		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav li.nav-item.dropdown:nth-child(3)"));
		actions.moveToElement(menu).perform();
		//		
		////		 Click an menu item
		WebElement menuItem = driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]"));
		actions.moveToElement(menu).click(menuItem).perform();
		//		
		////		Right click of mouse		
		WebElement search = driver.findElement(By.name("search"));
		actions.contextClick(search).perform();
		//		
		////		Double click
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(), 'Double Click Me!')]"));
		actions.doubleClick(doubleClick).perform();

		//		
		//		scroll down

		//		Screenshot taking
		WebElement menu1 = driver.findElement(By.cssSelector("ul.nav.navbar-nav li.nav-item.dropdown:nth-child(3)"));
		WebElement menuItem2 = driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]"));
		actions.moveToElement(menu1).click(menuItem2).perform();
		WebElement search1 = driver.findElement(By.name("search"));
		search1.sendKeys(Keys.PAGE_DOWN);
		////		search.sendKeys(Keys.chord(Keys.SHIFT+"p"));
		//		
		TakesScreenshot screenSS = (TakesScreenshot) driver;
		File srcFile = screenSS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D:\\Screenshots\\FullPage.png"));
		WebElement items = driver.findElement(By.xpath("(//div[@class = 'product-thumb'])[1]"));
		File itemSrc = items.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(itemSrc, new File("D:\\Screenshots\\Items.png"));
		//		




	}

}
