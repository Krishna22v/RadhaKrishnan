package testweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforcetest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver call=new ChromeDriver();
		call.manage().window().maximize();
		call.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		call.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");;
		call.findElement(By.xpath("//form[@name='signup_form_fAT9']//input[@id='signup_form_fAT9']")).sendKeys("radhakrishnan");
		call.findElement(By.id("UserLastName-jgPF")).sendKeys("V");
		call.findElement(By.id("UserEmail-s4DH")).sendKeys("radhakrishnan@gmail.com");
		call.findElement(By.id("CompanyName-K2bX")).sendKeys("Space-x");
		call.findElement(By.id("UserPhone-GxmY")).sendKeys("1234567890");
		WebElement DropDown=call.findElement(By.id("UserTitle-ErARcreateLeadForm_currencyUomId"));
	    Select index=new Select(DropDown);
		index.selectByIndex(8);
		WebElement DropDown1=call.findElement(By.id("CompanyEmployees-b0Qt"));
	    Select index1=new Select(DropDown1);
		index1.selectByIndex(1);
		call.findElement(By.id("checkbox-ui")).click();	
		call.close();
}

}
