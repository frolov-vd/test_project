package headhunter.tests;

import headhunter.PO.ResumesSearchPage;
import headhunter.constants.ResumeUrls;
import headhunter.utils.TestBase;
import org.apache.logging.log4j.ThreadContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static headhunter.constants.ResumeUrls.*;

public class ResumesSearchPageTest extends TestBase {
  @DataProvider(name = "resumesUrls", parallel = true)
  public ResumeUrls[] vacanciesUrls() {
    return new ResumeUrls[]{HH_RU_RESUMES,
        HH_KZ_RESUMES, HH_AZ_RESUMES
    };
  }

  @Test(description = "Проверка активнго таба Резюме после перехода по ссылке с параметром /resume",
      dataProvider = "resumesUrls")

  public static void resumeTabIsActiveAfterNavigateTest(ResumeUrls url) {
    new ResumesSearchPage().open(url).resumeTabIsActive();
  }

  @BeforeMethod
  public void setThreadName(Method method) {
    ThreadContext.put("threadName", method.getName());
  }
}