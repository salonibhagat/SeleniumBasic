package february23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SA\\Downloads\\chromedriver.exe"); //path of executable

        WebDriver driver = new ChromeDriver(); // object of class chrome driver
        
        driver.get("https://www.google.co.in"); // chrome will open this url
	
		Thread.sleep(2000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks);
		
		for (WebElement link : allLinks) {
			
			System.out.println(link.getText() + " --> " + link.getAttribute("href") );
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
