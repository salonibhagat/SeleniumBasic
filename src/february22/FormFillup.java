package february22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFillup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SA\\Downloads\\chromedriver.exe"); //path of executable

        WebDriver driver = new ChromeDriver(); // object of class chrome driver
        
        driver.get("http://newtours.demoaut.com/"); // chrome will open this url
        
        driver.findElement(By.linkText("REGISTER")).click();

        WebElement textBox = driver.findElement(By.name("firstName")); // inspected the field, and use name locator
        
        textBox.sendKeys("jack"); // to type input

        WebElement textBox1 = driver.findElement(By.name("lastName")); 

        textBox1.sendKeys("moore");
        
        WebElement textBox3 = driver.findElement(By.name("phone")); 

        textBox3.sendKeys("9878657898");

        WebElement textBox2 = driver.findElement(By.name("userName")); 

        textBox2.sendKeys("jack.moore@gmail.com");

        WebElement textBox4 = driver.findElement(By.name("address1")); 

        textBox4.sendKeys("viman nagar");
        WebElement textBox5 = driver.findElement(By.name("address2")); 

        textBox5.sendKeys("nagar road");
        
        WebElement textBox6 = driver.findElement(By.name("city")); 

        textBox6.sendKeys("pune");

        WebElement textBox7 = driver.findElement(By.name("state")); 

        textBox7.sendKeys("maharashta");
        
        
        WebElement textBox8 = driver.findElement(By.name("postalCode")); 

        textBox8.sendKeys("400411");
        
        WebElement textBox9 = driver.findElement(By.name("email")); 

        textBox9.sendKeys("jack.moore@gmail.com");
        
        WebElement textBox10 = driver.findElement(By.name("password")); 

        textBox10.sendKeys("welcome123");

                
        
        

	}

}
