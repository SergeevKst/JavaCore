package patterns.behavioral.template;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate well=new WelcomePage();
        WebsiteTemplate news=new NewsPage();

        well.showPage();
        news.showPage();
    }
}
