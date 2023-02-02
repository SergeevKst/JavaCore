package patterns.behavioral.memento;

public class Runner {
    public static void main(String[] args) {
        Project project=new Project();
        GitRepo gitRepo=new GitRepo();

        System.out.println("Create project");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);
        System.out.println("Saving to gitHub");
        gitRepo.setSave(project.save());

        System.out.println("Updating project to version 1.1");

        System.out.println("Writing wrong code");

        project.setVersionAndDate("Version 1.1.");

        System.out.println(project);

        System.out.println("Something wrong");

        System.out.println("Rollback");

        project.load(gitRepo.getSave());

        System.out.println(project);
    }
}
