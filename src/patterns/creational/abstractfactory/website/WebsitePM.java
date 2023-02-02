package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages web project...");
    }
}
