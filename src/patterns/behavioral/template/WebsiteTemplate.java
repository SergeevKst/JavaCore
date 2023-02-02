package patterns.behavioral.template;

public abstract class WebsiteTemplate {
    public void showPage(){
        System.out.println("Header");
        showContent();
        System.out.println("Footer");
    }
    public abstract void showContent();
}
