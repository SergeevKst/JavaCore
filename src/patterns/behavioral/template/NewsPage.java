package patterns.behavioral.template;

public class NewsPage extends WebsiteTemplate{
    @Override
    public void showContent(){
        System.out.println("News!");
    }
}
