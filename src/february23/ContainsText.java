package february23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SA\\Downloads\\chromedriver.exe"); //path of executable

        WebDriver driver = new ChromeDriver(); // object of class chrome driver
        
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html"); // chrome will open this url

        driver.findElement(By.xpath("//input[@id = 'user-message']")).sendKeys("i know the path");
        
        driver.findElement(By.xpath("button[contains(text(),'show message')]")).click();
        
	}

}
