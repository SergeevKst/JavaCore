package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null) {
            switch (specialty) {
                case "java" -> {
                    System.out.println("Looking for Java developer...");
                    developer = new JavaDeveloper();
                }
                case "c++" -> {
                    System.out.println("Looking for C++ developer...");
                    developer = new CppDeveloper();
                }
            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}
