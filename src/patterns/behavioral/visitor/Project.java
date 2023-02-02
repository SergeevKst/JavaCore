package patterns.behavioral.visitor;

import java.util.Arrays;

public class Project implements ProjectElement {
    private final ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        Arrays.stream(projectElements)
                .forEach(e->e.beWritten(developer));
    }
}
