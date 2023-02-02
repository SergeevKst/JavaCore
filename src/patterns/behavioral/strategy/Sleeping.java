package patterns.behavioral.strategy;

import patterns.behavioral.state.Activity;

public class Sleeping implements Activity {
    @Override
    public void doIt() {
        System.out.println("Sleep");
    }
}
