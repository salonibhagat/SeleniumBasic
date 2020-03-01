package february23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SA\\Downloads\\chromedriver.exe"); //path of executable

        WebDriver driver = new ChromeDriver(); // object of class chrome driver
        
        driver.get("https://demoqa.com/automation-practice-form/"); // chrome will open this url
        
        driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("saloni");
        
        driver.findElement(By.xpath("//input[@value = 'Manual Tester']")).click();

        
        

	}

}
