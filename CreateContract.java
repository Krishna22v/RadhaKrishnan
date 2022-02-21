package testweb;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class createContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("radhakrishnan");
		driver.findElement(By.id("lastNameField")).sendKeys("v");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("subaru");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("jon");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Software");
		driver.findElement(By.id("createContactForm_description")).sendKeys("I like to join in Testleaf");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("DarkFade407@gmail.com");
		driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).sendKeys("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Follow the instructions as per privacy policy");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title="View Contact | opentaps CRM";
		String title1=driver.getTitle();
		if(title.equals(title1)) {
			System.out.println("Title of the page is displayed");
		}else {
			System.out.println("Title of the page is not displayed");
		}
	}
	}

