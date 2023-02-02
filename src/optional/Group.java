package optional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Group {

    private final List<Person> personList;

    public Person getPerson(String name) {
        Person mock = new Person("Unknown", 0);
        if (getOfNullablePerson(name).isPresent()) {
            return getOfNullablePerson(name).get();
        }

        return getOfNullablePerson(name).orElse(mock);
    }

    public Person getPersonOrException(String name) {
        return getOfNullablePerson(name).orElseThrow(NoSuchElementException::new);
    }

    public Optional<Person> findFirstNotNull(){
        Optional<Person> optional=Optional.ofNullable(personList.get(0));

        for (Person p: personList) {
            Optional<Person> temp=Optional.ofNullable(p);
            optional=optional.or(()->temp);
        }
        return optional;
    }

    private Optional<Person> getOfNullablePerson(String name) {
        Person result = null;
        for (Person p : personList) {
            if (p.getName().equals(name)) {
                result = p;
            }
        }
        return Optional.ofNullable(result);
    }

    public Group(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Group{" + personList + '}';
    }
}
