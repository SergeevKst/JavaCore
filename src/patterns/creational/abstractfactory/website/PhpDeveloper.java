package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer write PHP code..");
    }
}
