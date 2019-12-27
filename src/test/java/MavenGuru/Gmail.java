package MavenGuru;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class Gmail {
	public WebDriver driver;
	
  @Test
  public void fun() throws InterruptedException, IOException {
	  driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("swamykumartesting@gmail.com");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("9912345678");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.name("to")).sendKeys("suryavarma.vegesna9@gmail.com");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//div[@command='Files']")).click();
	  Thread.sleep(5000);
	  
	  Runtime.getRuntime().exec("C:\\Users\\surya\\Desktop\\upload.2au3.exe\\");
  }
  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\Desktop\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.get("https://www.gmail.com");
	  
	
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
