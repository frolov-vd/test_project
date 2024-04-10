package headhunter.PE;

import org.openqa.selenium.By;

public class ActiveTab {
  private static String baseSelector = "//*[contains(@class, 'tab_active')]";

  public static By getActiveTab(String dataHhTabId) {
    return By.xpath(baseSelector + "[@data-hh-tab-id='" + dataHhTabId + "']" );
  }
}
