package patterns.creational.builder.site;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    public void buildName() {
        website.setName("Visit card");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    public void buildPrice() {
        website.setPrice(500);
    }
}
