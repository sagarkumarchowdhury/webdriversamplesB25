package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_Dom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		http://watir.com/examples/shadow_dom.html
		
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
		SearchContext shadowRoot =  shadowHost.getShadowRoot();
		String Text = shadowRoot.findElement(By.id("shadow_content")).getText();
		System.out.println("Value is :" + Text);
		SearchContext shadowRoot1 =  shadowHost.getShadowRoot();
		String strProperty = shadowRoot1.findElement(By.id("shadow_content")).getDomProperty("namespaceURI");
		System.out.println("Value is :" + strProperty);
		

	}

}
