package patterns.creational.abstractfactory.app;

import patterns.creational.abstractfactory.Developer;
import patterns.creational.abstractfactory.ProjectManager;
import patterns.creational.abstractfactory.ProjectTeamFactory;
import patterns.creational.abstractfactory.Tester;
import patterns.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory=new WebsiteTeamFactory();

        Developer developer=projectTeamFactory.getDeveloper();
        Tester tester=projectTeamFactory.getTester();
        ProjectManager projectManager=projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system");

        developer.writeCode();
        tester.writeTest();
        projectManager.manageProject();


    }
}
