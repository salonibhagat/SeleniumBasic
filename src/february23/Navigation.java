package february23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SA\\Downloads\\chromedriver.exe"); //path of executable

        WebDriver driver = new ChromeDriver(); // object of class chrome driver
        
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html"); // chrome will open this url

        Thread.sleep(3000);
        
        driver.findElement(By.linkText("Selenium Easy")).click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        
        driver.navigate().forward();
        Thread.sleep(3000);
        
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.navigate().to("https://www.google.co.in");
		
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
