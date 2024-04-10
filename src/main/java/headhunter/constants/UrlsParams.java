package headhunter.constants;

 enum UrlsParams {
  VACANCIES("/vacancy"),
  SEARCH("/search"),
  RESUME("/resume");

  private String param;

  UrlsParams(String param) {
    this.param = param;
  }

  public String getParam() {
    return param;
  }
}
