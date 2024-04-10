package headhunter.utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.time.Duration;

public class TestBase {
  protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
  protected static final Logger logger = LogManager.getLogger("Logger");


  @BeforeMethod(alwaysRun = true)
  public void setUp(Method method) {
    driver.set(new ChromeDriver());
    PropertyConfigurator.configure("src/main/resources/log4j.properties");
    driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    driver.get().manage().timeouts().scriptTimeout(Duration.ofSeconds(6));
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() {
    if (driver != null) {
      driver.get().quit();
    }
  }
}