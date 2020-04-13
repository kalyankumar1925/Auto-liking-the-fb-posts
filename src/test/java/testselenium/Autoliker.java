package testselenium;


import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class Autoliker
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mkalyankumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("disable-geolocation");
		option.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 3000);
		driver.manage().window().maximize();
		String googleUrl = "http://www.fb.com/";
		driver.get(googleUrl);
		driver.findElement(By.name("email")).sendKeys("7075094484");
	    driver.findElement(By.name("pass")).sendKeys("k127125n"+Keys.ENTER);
		//driver.findElement(By.xpath("//div[@class='_cy7']")).click();
		driver.findElement(By.xpath("//input[@class='_1frb']")).sendKeys("pavan kumar"+Keys.ENTER);
       //List<WebElement>sl=driver.findElements(By.xpath("//*[@class='_19bk']"));
       // sl.get(0).click();
        List<WebElement>nl=driver.findElements(By.xpath("//a[@data-ft='{\"tn\":\"-]\"}']"));
        nl.get(0).click();
        String c=driver.getCurrentUrl();
        driver.get(c);
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)", "");
		Thread.sleep(1100);
		//js.executeScript("window.scrollBy(0,4000)", "");
	    List<WebElement> like = driver.findElements(By.xpath("//div[@class='_666k']//div[@class='_8c74']"));
	    System.out.println(like.size());
	    Thread.sleep(5000);
	    System.out.println(like.get(0).getText());
	    System.out.println(like.get(1).getText());
	    for(int i=0;i<like.size();i++){
	    	//if(like.get(i).getAttribute("aria_pressed")!="true")
	    	
	    	like.get(i).click();
	    	System.out.print(i);
	    }
	}
}