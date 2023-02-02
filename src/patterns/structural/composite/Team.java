package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final List<Developer> developerList = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developerList.add(developer);
    }

    public void createProject() {
        System.out.println("Team create project...");
        developerList.forEach(Developer::writeCode);
    }

    public void removeDeveloper(Developer developer) {
        developerList.remove(developer);
    }
}
