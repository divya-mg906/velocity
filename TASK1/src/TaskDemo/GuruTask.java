package TaskDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GuruTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("guru demo test");
System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://demo.guru99.com/test/newtours/");
driver.findElement(By.name("userName")).sendKeys("mercury");
driver.findElement(By.name("password")).sendKeys("mercury");
driver.findElement(By.name("submit")).click();
driver.findElement(By.linkText("REGISTER")).click();
driver.findElement(By.name("firstName")).sendKeys("divya");
driver.findElement(By.name("lastName")).sendKeys("MG");
driver.findElement(By.name("phone")).sendKeys("981022");
driver.findElement(By.cssSelector("#userName")).sendKeys("abc@gmail.com");
driver.findElement(By.name("address1")).sendKeys("vilasam");
driver.findElement(By.xpath("//*[@name=\"city\"]")).sendKeys("kollam");
driver.findElement(By.name("state")).sendKeys("kerala");
driver.findElement(By.name("postalCode")).sendKeys("61023");
driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
driver.findElement(By.name("password")).sendKeys("abc123");
driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
driver.findElement(By.xpath("//*[@name=\"submit\"]")).click();
}
}
