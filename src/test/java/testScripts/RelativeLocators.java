package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class RelativeLocators {

	public static void main(String[] args) {
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

}
