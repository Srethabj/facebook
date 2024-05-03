package newfacebookgithub;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Github_Facebook {
	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://www.facebook.com");
driver.findElement(By.name("email")).sendKeys("Sretha");

driver.findElement(By.name("pass")).sendKeys("Srethabj1");
driver.findElement(By.name("login")).click();
}
}