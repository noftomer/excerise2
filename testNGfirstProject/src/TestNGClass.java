import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGClass {
	WebDriver driver;
  @BeforeClass (groups= {"Sanity"})
  public void start() {
	  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver_original.exe");
	  driver=new ChromeDriver();
	  
  }
  @AfterClass (groups= {"Sanity"})//
  public void close() {
	  try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.quit();
  }
	@Test(groups= {"Sanity"})
  public void test1() {
	  driver.get("https://www.google.co.il/?hl=iw");
	  System.out.println("In "+Thread.currentThread().getStackTrace()[1].getMethodName()+": thread="+Thread.currentThread().getId());
	  
  }
	@Test(groups= {"Sanity"})
	  public void test2() {
		  driver.get("https://www.google.co.il/?hl=iw");
		  System.out.println("In "+Thread.currentThread().getStackTrace()[1].getMethodName()+": thread="+Thread.currentThread().getId());
		  
	  }
	@Test
	  public void test3() {
		  driver.get("https://www.google.co.il/?hl=iw");
		  System.out.println("In "+Thread.currentThread().getStackTrace()[1].getMethodName()+": thread="+Thread.currentThread().getId());
	  }

	@Test
	  public void test4() {
	  driver.get("https://www.google.co.il/?hl=iw");
		  System.out.println("In "+Thread.currentThread().getStackTrace()[1].getMethodName()+": thread="+Thread.currentThread().getId());
	  }

	@Test(groups= {"Sanity"})
	  public void test5() {
	  driver.get("https://www.google.co.il/?hl=iw");
		  System.out.println("In "+Thread.currentThread().getStackTrace()[1].getMethodName()+": thread="+Thread.currentThread().getId());
	  }
}
