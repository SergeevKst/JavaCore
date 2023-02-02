package patterns.behavioral.strategy;

import patterns.behavioral.state.Activity;

public class Coding implements Activity {
    @Override
    public void doIt() {
        System.out.println("Write code");
    }
}
