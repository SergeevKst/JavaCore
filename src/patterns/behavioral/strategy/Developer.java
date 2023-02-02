package patterns.behavioral.strategy;

import patterns.behavioral.state.Activity;

public class Developer {
    private patterns.behavioral.state.Activity activity;

    public void executeActivity() {
        activity.doIt();
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

}
