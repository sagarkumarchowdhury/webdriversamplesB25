package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		String salary = driver.findElement(By.xpath("//td[contains(text(), 'B. Wagner')]//following-sibling::td[5]")).getText();
		
		System.out.println("Salary of B. Wagner is :" + salary);
		System.out.println("Modified by Tester2");

	}
	
//	Exercise: find list of employs working in San francisco

}
