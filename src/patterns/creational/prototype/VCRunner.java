package patterns.creational.prototype;

public class VCRunner {
    public static void main(String[] args) {
        Project master=new Project(1,"PatternProject","SourceCode sourceCode=new SourceCode();");
        System.out.println(master);

        ProjectFactory factory=new ProjectFactory(master);
        Project masterClone=factory.cloneProject();

        System.out.println("=========================================");
        System.out.println(masterClone);

    }
}
