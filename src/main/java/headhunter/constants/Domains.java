package headhunter.constants;

 enum Domains {
  HH_RU("https://hh.ru"),
  HH_KZ("https://hh.kz"),
  SAMARA("https://samara.hh.ru"),
  HH1_AZ("https://hh1.az");
  private String domain;

  Domains(String domain) {
    this.domain = domain;
  }

  public String getDomain() {
    return domain;
  }
}
