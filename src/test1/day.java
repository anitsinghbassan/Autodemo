package test1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day {
	WebDriver driver;
	
	
public void invokeBrovser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhuri Yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
//			org.openqa.selenium.WebDriver driver = new FirefoxDriver();
		
			driver = new ChromeDriver();
	
			driver.manage().deleteAllCookies();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://techximum.com/txform");
			gmails();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gmails(){
		try {
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("admin@!@#");
			
			driver.findElement(By.id("signin")).click();
			
			Thread.sleep(2000);
			
//			System.out.println("123>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
			driver.switchTo().alert().accept();
			System.out.println("456>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			//driver.findElement(By.xpath("//i[@class='fa fa-user-circle']")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[1]")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[2]")).click();
			//driver.findElement(By.xpath("//a[@href='summary']")).click();
			//selectByDropdown("//select[@class='form-control input-sm']']","50");
			//driver.findElement(By.xpath("html/body/nav/div/div[1]/a/img")).click();
			driver.findElement(By.id("companyName")).sendKeys("Test");
			driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/form/div[1]/div[2]/div[1]/input")).sendKeys("anit.techximum@gmail.com");
     		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/form/div[1]/div[1]/div[2]/input")).sendKeys("Tester");
			driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/form/div[1]/div[2]/div[2]/input")).sendKeys("85654775");
			driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/form/div[1]/div[1]/div[3]/input")).sendKeys("85654775");
			driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/form/div[1]/div[2]/div[3]/input")).sendKeys("4643446");
			driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/form/div[1]/div[1]/div[4]/input")).sendKeys("http://techximumproject.com/txform/customer-details/");
			driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/form/div[1]/div[2]/div[4]/input")).sendKeys("Dwarka");
			driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/form/div[1]/div[3]/div/textarea")).sendKeys("Dwarka");
			driver.findElement(By.xpath("//input[@class='tx-form-button']")).click();
			
			
			//driver.findElement(By.xpath("//i[@class='fa fa-user-circle']")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[1]")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[2]")).click();
			//driver.findElement(By.xpath("//a[@href='summary']")).click();
			//selectByDropdown("//select[@class='form-control input-sm']']","50");
			//driver.findElement(By.xpath("html/body/nav/div/div[1]/a/img")).click();
			driver.findElement(By.xpath("//label[@for=\"radio-1-2\"]")).isDisplayed();
			driver.findElement(By.xpath("//label[@for=\"radio-1-2\"]")).click();
			
			
//			driver.findElement(By.xpath("//label[@for=\"radio-4-2\"]")).click();
		    driver.findElement(By.xpath("//input[@placeholder='No. of pages']")).sendKeys("1");
			
		    selectByDropdown("//select[@id='SelectBusiness']","Restaurant");
		
//			driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/form/div[1]/div[5]/div[3]/div/input")).sendKeys("4654");
		    driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/form/div[1]/div[6]/div/textarea")).sendKeys("Hello");
			driver.findElement(By.xpath("//input[@class='tx-form-button']")).click();
			
			
			//driver.findElement(By.xpath("//i[@class='fa fa-user-circle']")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[1]")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[2]")).click();
			//driver.findElement(By.xpath("//a[@href='summary']")).click();
			//selectByDropdown("//select[@class='form-control input-sm']']","50");
			//driver.findElement(By.xpath("html/body/nav/div/div[1]/a/img")).click();
			//driver.findElement(By.xpath("//a[@class='tx-form-button-prev']")).click();
			
			driver.findElement(By.xpath("//label[@for='analyticsno']")).click();
			driver.findElement(By.xpath("//textarea[@placeholder=\"Comment\"]")).sendKeys("Hey Buddy");
			driver.findElement(By.xpath("//input[@class='tx-form-button']")).click();
			//driver.findElement(By.xpath("//a[@class='tx-form-button-prev']")).click();
			
			
			//driver.findElement(By.xpath("//i[@class='fa fa-user-circle']")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[1]")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[2]")).click();
			//driver.findElement(By.xpath("//a[@href='summary']")).click();
			//selectByDropdown("//select[@class='form-control input-sm']']","50");
			//driver.findElement(By.xpath("html/body/nav/div/div[1]/a/img")).click();
			
			//driver.findElement(By.xpath("//label[@for='radio-6-2']")).click();
//................................................................................................................................			
			selectByDropdown("//select[@class='form-control']","Linux Hosting");
			driver.findElement(By.xpath("//Button[@id='addmoredomainName']")).click();
			driver.findElement(By.xpath("//Button[@id='addmoredomainName']")).click();
			driver.findElement(By.xpath("//span[@class='removedomainName']")).click();
			
			driver.findElement(By.xpath("//input[@name='abn']")).sendKeys("012-001");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hert@ol.com");
			selectByDropdown("//select[@name='duration']","5 Year");
			driver.findElement(By.xpath("//input[@name='cost']")).sendKeys("012001");
			driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Hey Buddy");
			driver.findElement(By.xpath("//input[@class='tx-form-button']")).click();
			
			//driver.findElement(By.xpath("//i[@class='fa fa-user-circle']")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[1]")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[2]")).click();
			//driver.findElement(By.xpath("//a[@href='summary']")).click();
			//selectByDropdown("//select[@class='form-control input-sm']']","50");
			//driver.findElement(By.xpath("html/body/nav/div/div[1]/a/img")).click();
			//driver.findElement(By.xpath("//a[@class='tx-form-button-prev']")).click();
			
//...............................................................................................................................
			driver.findElement(By.xpath("//label[@for='radio-7-2']")).click();
			driver.findElement(By.xpath("//input[@placeholder='No. of Emails']")).sendKeys("12");
			driver.findElement(By.xpath("//input[@placeholder='Minimum Space']")).sendKeys("100");
			driver.findElement(By.xpath("//input[@placeholder='Additional Space']")).sendKeys("102");
			driver.findElement(By.xpath("//input[@placeholder='Price']")).sendKeys("12342");
			driver.findElement(By.xpath("//input[@placeholder='Employee Name']")).sendKeys("Kaily");
			driver.findElement(By.xpath("//input[@placeholder='Employee Email']")).sendKeys("kaily@zonk.com");
			driver.findElement(By.xpath("//button[@id='addmoreEmployee']")).click();
			driver.findElement(By.xpath("//button[@id='addmoreEmployee']")).click();
			//driver.findElement(By.xpath("//span[@class='removeEmployee']")).click();
			//driver.findElement(By.xpath("//span[@class='removeEmployee']")).click();
			driver.findElement(By.xpath("//textarea[@placeholder=\"Any description want to add...\"]")).sendKeys("Just Keep Calm");
			driver.findElement(By.xpath("//input[@class='tx-form-button']")).click();
			driver.findElement(By.xpath("//a[@class='tx-form-button-prev']")).click();
			
			//driver.findElement(By.xpath("//i[@class='fa fa-user-circle']")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[1]")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[2]")).click();
			//driver.findElement(By.xpath("//a[@href='summary']")).click();
			//selectByDropdown("//select[@class='form-control input-sm']']","50");
			//driver.findElement(By.xpath("html/body/nav/div/div[1]/a/img")).click();

//..................................................................................................................................
			
			driver.findElement(By.xpath("//label[@for='radio-8-5']")).click();
			driver.findElement(By.xpath("//textarea[@placeholder=\"Any description want to add...\"]")).sendKeys("what are you waiting for");
			driver.findElement(By.xpath("//button[@class='tx-form-button']")).click();
			
			//driver.findElement(By.xpath("//i[@class='fa fa-user-circle']")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[1]")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[2]")).click();
			//driver.findElement(By.xpath("//a[@href='summary']")).click();
			//selectByDropdown("//select[@class='form-control input-sm']']","50");
			//driver.findElement(By.xpath("html/body/nav/div/div[1]/a/img")).click();
			
			//driver.findElement(By.xpath("//a[@class='tx-form-button-prev']")).click();
//...............................................................................................................................
			
			driver.findElement(By.xpath("//label[@for='radio-10-3']")).click();
			
			WebElement file = driver.findElement(By.xpath("//input[@type='file']"));
			file.sendKeys("C:\\Users\\Madhuri Yadav\\Desktop\\eclipse\\eclipse.exe");
			driver.findElement(By.xpath("//input[@placeholder='Price']")).sendKeys("200");
			driver.findElement(By.xpath("//textarea[@placeholder=\"Any description want to add...\"]")).sendKeys("what are you waiting for");
			driver.findElement(By.xpath("//button[@class='tx-form-button']")).click();
			
			//driver.findElement(By.xpath("//i[@class='fa fa-user-circle']")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[1]")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[2]")).click();
			//driver.findElement(By.xpath("//a[@href='summary']")).click();
			//selectByDropdown("//select[@class='form-control input-sm']']","50");
			//driver.findElement(By.xpath("html/body/nav/div/div[1]/a/img")).click();
			
			//driver.findElement(By.xpath("//a[@class='tx-form-button-prev']")).click();
			
//...............................................................................................................................
			
			driver.findElement(By.xpath("//label[@for='checkbox-1-3']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//textarea[@placeholder=\"Any description want to add...\"]")).sendKeys("what are you waiting for");
			driver.findElement(By.xpath("//button[@class='tx-form-button']")).click();
			
			//driver.findElement(By.xpath("//i[@class='fa fa-user-circle']")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[1]")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[2]")).click();
			//driver.findElement(By.xpath("//a[@href='summary']")).click();
			//selectByDropdown("//select[@class='form-control input-sm']']","50");
			//driver.findElement(By.xpath("html/body/nav/div/div[1]/a/img")).click();
			
			//driver.findElement(By.xpath("//a[@class='tx-form-button-prev']")).click();
//...........................................................................................................................
			driver.findElement(By.xpath(".//*[@id='w1']/li/a")).click();
			driver.findElement(By.xpath(".//*[@id='w1']/li/div/a[3]")).click();
//			
//			driver.findElement(By.xpath("//button[@type='button']")).click();
			
			//driver.findElement(By.xpath("//i[@class='fa fa-user-circle']")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[1]")).click();
			//driver.findElement(By.xpath("html/body/nav/div/div[2]/ul/li/div/a[2]")).click();
			//driver.findElement(By.xpath("//a[@href='summary']")).click();
			//selectByDropdown("//select[@class='form-control input-sm']']","50");
			//driver.findElement(By.xpath("html/body/nav/div/div[1]/a/img")).click();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
	public void selectByDropdown(String locator,String value)
	{
		Select dropDownLocator = new Select(driver.findElement(By.xpath(locator)));
		dropDownLocator.selectByVisibleText(value);
		
	}

	public static void main(String[] args) {
		
		
		day myObj = new day();
		myObj.invokeBrovser();
	}

}
