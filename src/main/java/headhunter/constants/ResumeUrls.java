package headhunter.constants;

public enum ResumeUrls {
  HH_RU_RESUMES(Domains.HH_RU.getDomain() + UrlsParams.SEARCH.getParam() + UrlsParams.RESUME.getParam()),
  HH_KZ_RESUMES(Domains.HH_KZ.getDomain() + UrlsParams.SEARCH.getParam() + UrlsParams.RESUME.getParam()),
  HH_AZ_RESUMES(Domains.HH1_AZ.getDomain() + UrlsParams.SEARCH.getParam() + UrlsParams.RESUME.getParam());

  private String url;

  ResumeUrls(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }
}
