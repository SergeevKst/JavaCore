package patterns.creational.builder.site;

public abstract class WebsiteBuilder {
    protected Website website;

    public void createWebsite() {
        website = new Website();
    }

    abstract void buildName();

    abstract void buildCms();

    abstract void buildPrice();

    public Website getWebsite() {
        return website;
    }
}
