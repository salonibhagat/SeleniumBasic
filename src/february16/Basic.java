package february16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SA\\Downloads\\chromedriver.exe"); //path of executable

        WebDriver driver = new ChromeDriver(); // object of class chrome driver
        
        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html"); // chrome will open this url
        
        WebElement textBox = driver.findElement(By.name("first_name")); // inspected the field, and use name locator
        
        textBox.sendKeys("Saloni"); // to type input

        WebElement textBox1 = driver.findElement(By.name("last_name")); 

        textBox1.sendKeys("Bhagat");

        WebElement textBox2 = driver.findElement(By.name("email")); 

        textBox2.sendKeys("bhagatsallu96@gmail.com");

        WebElement textBox3 = driver.findElement(By.name("phone")); 

        textBox3.sendKeys("9878657898");

        String title = driver.getTitle();
        
        System.out.println(title);
        
        driver.findElement(By.linkText("Selenium Easy")).click();
        
        System.out.println(driver.getTitle());
	}

}
