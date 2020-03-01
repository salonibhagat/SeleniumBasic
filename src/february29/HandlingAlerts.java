package february29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingAlerts {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SA\\Downloads\\chromedriver.exe"); //path of executable

        WebDriver driver = new ChromeDriver(); // object of class chrome driver
        
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html"); // chrome will open this url

        driver.findElement(By.xpath("//button[contains(text(), 'Click me!')]")).click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
        Thread.sleep(3000);
        
        alert.sendKeys("hello pune");
        Thread.sleep(3000);
        alert.accept();
        
        
	}

}
