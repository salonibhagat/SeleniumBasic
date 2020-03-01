package february22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SA\\Downloads\\chromedriver.exe"); //path of executable

        WebDriver driver = new ChromeDriver(); // object of class chrome driver
        
        driver.get("https://demoqa.com/automation-practice-form/"); // chrome will open this url
        
        driver.findElement(By.name("firstname")).sendKeys("saloni");
       List<WebElement> list = driver.findElements(By.name("sex"));
       System.out.println(list.size());
     System.out.println(list);
     
     list.get(1).click();
     
     List<WebElement> yearsOfExp = driver.findElements(By.name("exp"));
     System.out.println(yearsOfExp.size());
 
     yearsOfExp.get(6).click();
     
     List<WebElement> profession = driver.findElements(By.name("profession"));
     
     System.out.println(profession.size());
     
     for (WebElement ele : profession) {
    	 ele.click();
		
	}
     
     List<WebElement> tools = driver.findElements(By.name("tool"));
     
for (WebElement tool : tools) {
	
	if ((tool.getAttribute("value").contains("Selenium Webdriver"))) {
		
		tool.click();
	}
	
}     
     
     
     

	}

}
