package patterns.creational.builder.person;

public class PersonBuilderImpl implements PersonBuilder {
    Person person = new Person();

    @Override
    public PersonBuilder name(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public PersonBuilder age(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder sex(String sex) {
        person.setSex(sex);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
