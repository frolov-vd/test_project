package headhunter.PO;

import headhunter.PE.ActiveTab;
import headhunter.constants.VacanciesUrls;
import headhunter.utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class VacanciesSearchPage extends TestBase {
  private WebDriver driver;
  private final By activeVacanciesTab = ActiveTab.getActiveTab("searchVacancy");


  public VacanciesSearchPage() {
    driver = TestBase.driver.get();
  }

  public VacanciesSearchPage open(VacanciesUrls urls) {
    logger.info("Открыть страницу поиска вакансий");
    driver.get(urls.getUrl());
    return this;
  }

  public void vacancyTabIsActive() {
    logger.info("Проверить, что таб Вакансии активен");
    Assert.assertTrue(driver.findElement(activeVacanciesTab).isDisplayed()
        , "not found active tab Vacancies");
  }
}