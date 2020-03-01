package february23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SA\\Downloads\\chromedriver.exe"); //path of executable

        WebDriver driver = new ChromeDriver(); // object of class chrome driver
        
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html"); // chrome will open this url

	    WebElement dd = driver.findElement(By.id("select-demo"));
	    
	    Select ss = new Select(dd);
	    
	    ss.selectByValue("Sunday");
	    
	    
	    Select multiDD = new Select(driver.findElement(By.name("States")));
	    
	    multiDD.selectByValue("New York");
	    multiDD.selectByIndex(2);
	    Thread.sleep(2000);

	    multiDD.selectByVisibleText("California");
	    
	    multiDD.deselectAll();
	    
	    Thread.sleep(2000);
	    
	driver.close(); //will close the current browser or window.
	
	
	
	
	}

}
