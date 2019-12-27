package MavenGuru;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import org.testng.annotations.BeforeTest;
import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
	public WebDriver driver;
  @Test
  public void fun() throws Exception{
		
		  FileInputStream fi = new FileInputStream("C:\\Users\\surya\\Desktop\\gmaillogin.xls\\"); 
		  Workbook wb =Workbook.getWorkbook(fi);
		  Sheet s = wb.getSheet("Sheet1");
		 
		
		 driver.findElement(By.id("identifierId")).sendKeys(s.getCell(0,1).getContents());
		 WebElement username =driver.findElement(By.id("identifierNext"));
		 System.out.println(username);
		 username.click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("password")).sendKeys(s.getCell(1,1).getContents());
		 WebElement password = driver.findElement(By.id("passwordNext"));
		 System.out.println(password); password.click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("identifierId")).clear();
			
		 driver.findElement(By.id("identifierId")).sendKeys(s.getCell(0, 1).getContents());
		 driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("password")).sendKeys(s.getCell(1, 1).getContents());
		 driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
			Thread.sleep(10000);
			 
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\Desktop\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.get("http://gmail.com");
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
  }

}
