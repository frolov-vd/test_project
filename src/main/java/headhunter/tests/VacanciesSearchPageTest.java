package headhunter.tests;

import headhunter.PO.VacanciesSearchPage;
import headhunter.constants.VacanciesUrls;
import headhunter.utils.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static headhunter.constants.VacanciesUrls.*;

public class VacanciesSearchPageTest extends TestBase {

  @DataProvider(name = "vacanciesUrls", parallel = true)
  public VacanciesUrls[] vacanciesUrls() {
    return new VacanciesUrls[]{HH_RU_VACANCIES,
        HH_KZ_VACANCIES, HH_AZ_VACANCIES
    };
  }

  @Test(description = "Проверка активнго таба Вакансии после перехода по ссылке с параметром /vacancy",
      dataProvider = "vacanciesUrls")

  public void vacancyTabIsActiveAfterNavigateTest(VacanciesUrls url) {
    new VacanciesSearchPage().open(url).vacancyTabIsActive();
  }
}