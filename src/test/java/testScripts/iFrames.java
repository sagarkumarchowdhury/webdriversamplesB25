package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		String label = driver.findElement(By.cssSelector("label > span")).getText();
		System.out.println("Label is : " +label);

		//		From main page to frame1
		driver.switchTo().frame("frame1");
		//		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys("Hello World");

		//	from frame 1 to frame 3

		driver.switchTo().frame("frame3");
		WebElement chkBox = driver.findElement(By.id("a"));
		if(!chkBox.isSelected())
			chkBox.click();
		
//		Frame 3 to frame 1
		
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).clear();
		driver.findElement(By.tagName("input")).sendKeys("Welcome Back");
		
//		Frame 1 to main page
		
		driver.switchTo().defaultContent();
		String label1 = driver.findElement(By.cssSelector("label > span")).getText();
		System.out.println("Label after coming back : " +label1);
		
//		Main page to frame 2
		driver.switchTo().frame("frame2");
		Select sel = new Select(driver.findElement(By.id("animals")));
		sel.selectByValue("babycat");

	}

}
