package testweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver call=new ChromeDriver();
		call.get("http://www.leafground.com/pages/Button.html");
		call.manage().window().maximize();
		call.findElement(By.id("home")).click();
		
		Point location = call.findElement(By.id("position")).getLocation();
		int x = location.getX();
		System.out.println(x);
		int y = location.getY();
		System.out.println(y);
		
		String cssValue = call.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(cssValue);
		
		Dimension size = call.findElement(By.id("size")).getSize();
		int height = size.height;
		System.out.println(height);
		int width = size.width;
		System.out.println(width);
	}

}