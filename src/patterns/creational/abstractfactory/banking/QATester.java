package patterns.creational.abstractfactory.banking;

import patterns.creational.abstractfactory.Tester;

public class QATester implements Tester {
    @Override
    public void writeTest() {
        System.out.println("Tester write test...");
    }
}
