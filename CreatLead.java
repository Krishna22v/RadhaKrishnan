package testweb;
import java.nio.channels.SelectableChannel;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreatLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver call=new ChromeDriver();
		call.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		call.get("http://leaftaps.com/opentaps/control/login");
		call.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		call.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		call.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		call.findElement(By.linkText("CRM/SFA")).click();
		call.findElement(By.linkText("Leads")).click();
		call.findElement(By.linkText("Create Lead")).click();
		call.findElement(By.id("createLeadForm_companyName")).sendKeys("radha");
		call.findElement(By.id("createLeadForm_firstName")).sendKeys("line");
		call.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("like");
		call.findElement(By.id("createLeadForm_lastName")).sendKeys("adhi");
		WebElement DropDown1=call.findElement(By.id("createLeadForm_dataSourceId"));
		Select index=new Select(DropDown1);
		index.selectByIndex(4);
		call.findElement(By.id("createLeadForm_personalTitle")).sendKeys("jony");
	    call.findElement(By.id("createLeadForm_personalTitle")).sendKeys("king");
	    call.findElement(By.id("createLeadForm_departmentName")).sendKeys("edr");
	    WebElement DropDown2=call.findElement(By.id("createLeadForm_currencyUomId"));
	    Select index1=new Select(DropDown2);
		index1.selectByIndex(56);
	}
	

}
