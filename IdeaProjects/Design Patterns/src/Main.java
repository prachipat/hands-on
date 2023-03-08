public class Main {
    public static void main(String[] args) {
      System.out.println("******************************Factory****************************************");

      Profession prof = ProfessionFactory.getProfession("Doctor");
      prof.task();

      System.out.println("******************************Singleton****************************************");
        Singleton singleton1 = Singleton.getInstance();

        Singleton getSingleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(getSingleton2);

      System.out.println("******************************Adapter****************************************");
        WebDriver web = new ChromeDriver();
        web.getElement();
        web.selectElement();

        WebDriver web1 = new WebDriverAdapter(new IEDriver());
        web1.getElement();
        web1.selectElement();

      System.out.println("******************************Proxy****************************************");
      Internet internet = new InternetProxy();
      internet.connectTo("google.com");


    }

}