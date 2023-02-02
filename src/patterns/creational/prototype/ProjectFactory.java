package patterns.creational.prototype;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Project cloneProject(){
        return project.copy();
    }
}
