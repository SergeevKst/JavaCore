package patterns.structural.facade;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Troubleshooting...");
        } else {
            System.out.println("Developer looking for information...");
        }
    }
}
