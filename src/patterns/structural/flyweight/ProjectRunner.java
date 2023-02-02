package patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory=new DeveloperFactory();
        List<Developer> developerList=new ArrayList<>();

        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));

        developerList.add(developerFactory.getDeveloperBySpecialty("c++"));
        developerList.add(developerFactory.getDeveloperBySpecialty("c++"));
        developerList.add(developerFactory.getDeveloperBySpecialty("c++"));
        developerList.add(developerFactory.getDeveloperBySpecialty("c++"));


        developerList.forEach(Developer::writeCode);


    }
}
