package SeleniumWebdriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Amazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Classes\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		wd.get("http://www.amazon.in");
		
		
		//search the product, earphones in this case
		
		WebElement search = wd.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		/*action.moveToElement(search);
		action.click();*/
		search.sendKeys("earphones");
		search.submit();
		
		//store the search results in List, using classname
		 List <WebElement> earphone = wd.findElements(By.xpath("//a[@class='a-link-normal s-access-detail-page  s-color-twister-title-link a-text-normal']"));
		 
		 int num =earphone.size();
		 System.out.println("search results count: "+num);
		 
		 //create a string of the elements in the List
		 
		 String [] earphonelink = new String[num];
		 for(int i =0;i<(num-1);i++) {
			 WebElement x = earphone.get(i);
			 String s = x.getText();
			 earphonelink[i]=s;
		 }
		
		 for(int i=0;i<(num-1);i++) {
			 System.out.println(i+" element: "+earphonelink[i]);
		 }
		 
		 //Get text of the 6th element in array, use this text to click on the product with matching string
	
		 String ItemToBeAddedInCart = earphonelink[0];
		 
		 wd.findElement(By.linkText(ItemToBeAddedInCart)).click();
		 
		// wd.close();
		 
		 //Window handling
		 
		 ArrayList<String> wh = new ArrayList<String>(wd.getWindowHandles());
			
			for(int k=0;k<=wh.size()-1;k++) {
				
				System.out.println(wh.get(k));
			}
			String s = wh.get(wh.size()-1);
			
			wd.switchTo().window(s);
		 
		 
		
		 WebDriverWait wait = new WebDriverWait(wd,5);
		 //Add to cart
		 try {
			WebElement  AddToCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button"))); 
			AddToCart.click();
		 }
		 catch(Exception x) {
			 
			 WebElement AddToCart= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='a-button-text'][2]")));
			 AddToCart.click();
			 System.out.println("Add to cart button not found");
		 }
		 
		 
		 
		 WebElement proceed = wd.findElement(By.xpath("//a[contains(text(),'Proceed to Buy')]"));
		proceed.click();
		// wd.findElement(By.xpath("//input[@name=''submit.add-to-cart]"));
		 
		
		WebElement email = wd.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		email.sendKeys("Himanshu.garg1807@gmail.com");
		email.submit();
		
		WebElement password = wd.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		password.sendKeys("adgjmpt1");
		password.submit();
		
		WebElement selectaddress = wd.findElement(By.xpath("(//a[@class='a-declarative a-button-text '])[1]"));  //"(//input[contains(@value,'Add to Cart')])[1]"
		selectaddress.click();
		
		WebElement continuetopayment = wd.findElement(By.xpath("//input[@type='submit'][1]"));
		continuetopayment.click(); 
		 //wd.close();
		 
	}

}
