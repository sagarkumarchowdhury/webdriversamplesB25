package testScripts;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercises {
	
	
	public void Exercise1(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		List<WebElement> city = driver.findElements(By.xpath("//td[contains(text(), 'San Francisco')]"));
		int count = 0;
		for(int i=0; i< city.size(); i++) {
			count = count+1;
		}
		System.out.println("Number of employees working in San Francisco is : " + count);
	}


	public void Exercise2(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		//		relative Locators: toLeftOf and below
		String strName = driver.findElement(with(By.tagName("li")).toLeftOf(By.id("pid6")).below(By.id("pid1"))).getText();
		System.out.println("Text is :" +strName);

		//		Relative Locators: toRightOf and above
		String strName1 = driver.findElement(with(By.tagName("li")).toRightOf(By.id("pid1")).above(By.id("pid6"))).getText();
		System.out.println("Text is :" +strName1);
	}
	
	
	public void Exercise3(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath(("//span[@class= 'd-none d-md-inline'])[3]"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(), \"Register\")]")).click();
		Thread.sleep(5000);
	}
		
		
		
	public void Exercise4(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement src = driver.findElement(By.id("box4"));
		WebElement dest = driver.findElement(By.id("box101"));
		Thread.sleep(5000);
		action.dragAndDrop(src, dest).build().perform();	
		Thread.sleep(5000);
		System.out.println("Page title:" +driver.getTitle());
		
	
	}
	
}





