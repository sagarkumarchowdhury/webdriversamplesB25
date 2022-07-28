package testScripts;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertBoxes {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();




		//		Fluent wait
		Wait<WebDriver> waitFlu = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default' ]")).click();
		
		//		Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String strTxt = alert.getText();
		System.out.println("Alert Text : " + strTxt);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);



		//		Confirmation Alert

		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]")).click();
		Alert confirm = driver.switchTo().alert();
		Thread.sleep(2000);
		confirm.dismiss();
		Thread.sleep(2000);

		//		Prompt Alert

		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
		Alert prompt = driver.switchTo().alert();
		Thread.sleep(2000);
		prompt.sendKeys("Hello World");
		Thread.sleep(2000);
		prompt.accept();



	}

}
