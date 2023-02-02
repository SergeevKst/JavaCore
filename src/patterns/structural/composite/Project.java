package patterns.structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();
        Developer firstDeveloper = new JavaDeveloper();
        Developer secondDeveloper = new CppDeveloper();

        team.addDeveloper(firstDeveloper);
        team.addDeveloper(secondDeveloper);

        team.createProject();
    }
}
