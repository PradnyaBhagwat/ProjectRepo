package automation_framework;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.ConstantsFile;


public class test_amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		String searchKey = "handbags";
		String textMsg;
		
		driver = new FirefoxDriver();
		driver.get(ConstantsFile.website);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		//Sign in :
		driver.findElement(By.id("nav-signin-tooltip")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("ap_email")).sendKeys(ConstantsFile.email);
		driver.findElement(By.id("ap_password")).sendKeys(ConstantsFile.password);
		driver.findElement(By.id("signInSubmit")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement welcomeMsg = driver.findElement(By.xpath("//a[@id = 'nav-link-accountList']"));
		textMsg = welcomeMsg.getText();
		if(textMsg.contains(ConstantsFile.verifyMsg))
			{
				System.out.println("The user has logged in successfully");
			}
		
		//Enter search for category:
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchKey);
		driver.findElement(By.className("nav-input")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//filter for top brands and select top 5:
		
		/*while(i<=4)
		{
		driver.findElement(By.xpath("//ul[@id='ref_14630382011']/li/a/img")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		i++;
		}*/
		driver.findElement(By.xpath("//ul[@id='ref_2528832011']/li/a/img")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		/*List<WebElement> arr = driver.findElements(By.xpath("//ul[@id='ref_2528832011']/li/a/img"));
		arr.get(1).click();*/
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		/*List<WebElement> arr1 = driver.findElements(By.xpath("//ul[@id='ref_2528832011']/li/a/img"));
		arr1.get(2).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		List<WebElement> arr2 = driver.findElements(By.xpath("//ul[@id='ref_2528832011']/li/a/img"));
		arr2.get(3).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);*/
		//Select a product and proceed:
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		if (driver.findElement(By.xpath("//ul/li[@id='result_0']/div[@class='s-item-container']")).isDisplayed());
			driver.findElement(By.xpath("//ul/li[@id='result_0']/div[@class='s-item-container']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		if (driver.findElement(By.id("add-to-cart-button")).isDisplayed())
			System.out.println("The user has selected a product successfully");
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		if (driver.findElement(By.id("hlb-ptc-btn-native")).isDisplayed())
			System.out.println("The user has added a product successfully to his cart");
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		if(driver.findElement(By.className("//div/span[@class='a-button-inner']/a")).isDisplayed())
			System.out.println("The user has successfully reached the shipping address page");	
		driver.findElement(By.className("//div/span[@class='a-button-inner']/a")).click();
		if(driver.findElement(By.id("checkoutDisplayPage")).isDisplayed())
			System.out.println("The user has successfully reached the CC information page");	
		
		driver.close();

	}

}
