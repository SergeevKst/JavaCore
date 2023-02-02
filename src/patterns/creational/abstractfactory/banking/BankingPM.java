package patterns.creational.abstractfactory.banking;

import patterns.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages project...");
    }
}
