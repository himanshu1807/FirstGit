package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionsClassFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium Classes\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://facebook.com");
		wd.manage().window().maximize();
		
		
		Actions action = new Actions(wd);
		
		WebElement username = wd.findElement(By.xpath("//*[@id=\'email\']"));
		 action.moveToElement(username).click().sendKeys(username,"himanshu").build().perform();
		
		WebElement password = wd.findElement(By.xpath("//*[@id=\'pass\']"));
		action.moveToElement(password).click().sendKeys("himanshu").build().perform();
		
		Thread.sleep(2000);
		
		WebElement submit = wd.findElement(By.xpath("//*[@id=\'u_0_2\']"));
		
		int x = submit.getLocation().getX();
		int y = submit.getLocation().getY();
		System.out.println(x +" "+y);
		
		//action.moveToElement(submit).click().build().perform();
		
		
		action.moveByOffset(x, y).click().build();
		Thread.sleep(1000);
		action.perform();
		
		
		
		System.out.println("end");
		
	}

}
