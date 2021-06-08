package cognizant;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppleId {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://appleid.apple.com/account");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("Harsha");
		driver.findElementByXPath("(//input[@type='text'])[3]").sendKeys("Kumbam");
		Select country=new Select (driver.findElementByXPath("(//select[@aria-required='true'])[1]"));
		country.selectByVisibleText("India");
		driver.findElementByXPath("(//input[@type='text'])[4]").click();
		//Thread.sleep(1000);
		driver.findElementByXPath("(//input[@type='text'])[4]").sendKeys("07/13/2000");
		driver.findElementByXPath("//input[@type='email']").sendKeys("harsha@gmail.com");
		driver.findElementByXPath("//input[@id='password']").sendKeys("Harsha123@2k");
		driver.findElementByXPath("(//input[@type='password'])[2]").sendKeys("Harsha123@2k");
		String str=driver.findElementByXPath("//span[@class='form-message']").getText();
		System.out.println(str);
		Select mobile=new Select (driver.findElementByXPath("(//select[@aria-required='true'])[2]"));
		mobile.selectByVisibleText("+91 (India)");
		//driver.findElementByLinkText("Phone number").sendKeys("9876543210");
		driver.findElementByXPath("(//input[@aria-required='true'])[7]").sendKeys("9876543210");
//		String str1=driver.findElementByXPath("(//span[@class='form-message'])[2]").getText();
//		System.out.println(str1);
		driver.findElementByXPath("//div[@class='overflow-text']").click();
	}
}
