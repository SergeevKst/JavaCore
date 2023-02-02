package patterns.behavioral.visitor;

public class Runner {
    public static void main(String[] args) {
        Project project=new Project();

        Developer junior=new JuniorDeveloper();
        Developer senior=new SeniorDeveloper();

        project.beWritten(junior);
        project.beWritten(senior);
    }
}
