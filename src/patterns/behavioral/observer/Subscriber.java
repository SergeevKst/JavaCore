package patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer{
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println(name+" We have some changes in vacancies"+" "+vacancies);
    }
}
