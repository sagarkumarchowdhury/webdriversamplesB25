package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Java");
		System.out.println("Search box Attribute :" +search.getAttribute("role"));
		Thread.sleep(5000);
		List<WebElement> items = driver.findElements(By.xpath("//ul[@class ='erkvQe']//li//descendant::div[@class='wM6W7d']"));
		System.out.println("Number of Items :" + items.size());
		for(int i=0;i< items.size(); i++) {
			System.out.println(items.get(i).getText());
			System.out.println(items.get(i).getAttribute("class"));
			if(items.get(i).getText().equalsIgnoreCase("java online compiler")) {
				items.get(i).click();
				break;
			}
		}
		
	
	}

}
