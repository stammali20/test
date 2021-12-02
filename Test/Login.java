package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	
		System.setProperty("webdriver.gecko.driver", "C:\\Browser\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
Thread.sleep(4000);

driver.findElement(By.name("identifier")).sendKeys("arvindmjhs");

driver.findElement(By.className("VfPpkd-RLmnJb")).click();

	}

}
