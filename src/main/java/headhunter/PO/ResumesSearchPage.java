package headhunter.PO;

import headhunter.PE.ActiveTab;
import headhunter.constants.ResumeUrls;
import headhunter.utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ResumesSearchPage extends TestBase {
  private WebDriver driver;
  private final By activeResumeTab = ActiveTab.getActiveTab("resumeSearch");
  public ResumesSearchPage() {
    driver = TestBase.driver.get();
  }

  public ResumesSearchPage open(ResumeUrls urls) {
    driver.get(urls.getUrl());
    return this;
  }

  public void resumeTabIsActive() {
    Assert.assertTrue(driver.findElement(activeResumeTab).isDisplayed()
        , "not found active tab Resumes");
  }
}