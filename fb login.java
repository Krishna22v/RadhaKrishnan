package testweb;

import java.nio.channels.SelectableChannel;
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.Select;
public class Advancexpath1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver call=new ChromeDriver();
	call.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//call.manage().window().maximize();
	call.get("https://www.facebook.com/");
	//call.findElement(By.id("email")).sendKeys("radhakrishnan1999@yahoo.com");
	//call.findElement(By.id("pass")).sendKeys("krishna8188");
	//call.findElement(By.xpath("//div[@class='_9lsa']")).click();
	//call.findElement(By.className("_9lsa")).click();
	
	call.findElement(By.linkText("Create New Account")).click();
	call.findElement(By.xpath("//form[@name='reg']//input[@placeholder='First name']")).sendKeys("radha");
	call.findElement(By.name("lastname")).sendKeys("krishnan");
	call.findElement(By.name("reg_email__")).sendKeys("coin@gmai.com");
	call.findElement(By.id("password_step_input")).sendKeys("781184784");
	WebElement day = call.findElement(By.name("birthday_day"));
	// Select index =new Select(day);
	//index.selectByIndex(2);

}

}
