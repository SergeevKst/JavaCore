package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void writeTest() {
        System.out.println("Manual tester tests website...");
    }
}
