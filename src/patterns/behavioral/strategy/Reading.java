package patterns.behavioral.strategy;

import patterns.behavioral.state.Activity;

public class Reading implements Activity {
    @Override
    public void doIt() {
        System.out.println("Read book");
    }
}
