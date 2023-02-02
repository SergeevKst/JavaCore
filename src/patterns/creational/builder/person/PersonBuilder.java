package patterns.creational.builder.person;

public interface PersonBuilder {
    PersonBuilder name(String name);

    PersonBuilder age(int age);

    PersonBuilder sex(String sex);

    Person build();
}
