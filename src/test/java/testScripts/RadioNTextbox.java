package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioNTextbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		driver.findElement(By.xpath("//input[@type='radio' and @name='gender']")).click();
		
		Thread.sleep(2000);
		
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement checkBox = driver.findElement(By.xpath("(//input[@class ='cb1-element'])[2]"));
		checkBox.click();
		
		if(checkBox.isSelected())
			System.out.println("Checkbox is selected");
	
		

		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select day = new Select(driver.findElement(By.id("select-demo")));
		day.selectByValue("Tuesday");
		Thread.sleep(3000);
		day.deselectByIndex(2);
		
		
		Select mulSel = new Select(driver.findElement(By.id("multi-select")));
		mulSel.selectByIndex(0);
		mulSel.selectByValue("New York");
		mulSel.selectByVisibleText("Florida");
		System.out.println("Select values :" + mulSel.getAllSelectedOptions().size());
		

	}

}
