package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String S = "Amar ji";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(S);
		driver.findElement(By.cssSelector(("#alertbtn"))).click();
		System.out.println(driver.switchTo().alert().getText());
		String str= driver.switchTo().alert().getText();
		String[] s2=str.split("Hello");
		String s3[]= s2[1].split(",");
		System.out.println(s3[0]);
		driver.switchTo().alert().accept();
		
		
		// TODO Auto-generated method stub

	}

}
