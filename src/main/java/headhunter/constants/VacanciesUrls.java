package headhunter.constants;

public enum VacanciesUrls {
  HH_RU_VACANCIES(Domains.HH_RU.getDomain() + UrlsParams.SEARCH.getParam() + UrlsParams.VACANCIES.getParam()),
  HH_KZ_VACANCIES(Domains.HH_KZ.getDomain() + UrlsParams.SEARCH.getParam() + UrlsParams.VACANCIES.getParam()),
  HH_AZ_VACANCIES(Domains.HH1_AZ.getDomain() + UrlsParams.SEARCH.getParam() + UrlsParams.VACANCIES.getParam());

  private String url;

  public String getUrl() {
    return url;
  }


  VacanciesUrls(String url) {
    this.url = url;
  }
}
