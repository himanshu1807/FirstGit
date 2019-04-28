package SeleniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Classes\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.get("http://jsbin.com/usidix/1");
		wd.manage().window().maximize();
		
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement we1= wd.findElement(By.xpath("//input[contains(@onclick,'showAlert')]"));
		we1.click();
		
		Alert a = wd.switchTo().alert();
		String s = a.getText();
		System.out.println(s);
		Thread.sleep(1000);
		a.accept();
		
		

	}

}
