package patterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactory("c++");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

    private static DeveloperFactory createDeveloperFactory(String kind) {
        if (kind.equalsIgnoreCase("Java")) {
            return new JavaDeveloperFactory();
        } else if (kind.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(kind + " invalid");
        }
    }
}
