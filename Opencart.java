package testweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver call=new ChromeDriver();
		call.manage().window().maximize();
		call.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		call.get("https://www.opencart.com/index.php?route=account/register");;
		call.findElement(By.name("username")).sendKeys("radha");
		call.findElement(By.name("firstname")).sendKeys("krishna");
		call.findElement(By.name("lastname")).sendKeys("V");
		call.findElement(By.name("email")).sendKeys("@gmail.com");
		call.findElement(By.name("passworde")).sendKeys("1234@123");
		//call.findElement(By.xpath("//div[@data-captcha='#button-register button']//a")).click();
		call.close();
		

}
}
