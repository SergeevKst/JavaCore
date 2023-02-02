package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed {
   private final List<String> vacancies = new ArrayList<>();
   private final List<Observer> observerList = new ArrayList<>();

    public void addVacancies(String v) {
        vacancies.add(v);
        notifyObserver();
    }

    public void removeVacancies(String v) {
        vacancies.remove(v);
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observerList.forEach(e -> e.handleEvent(this.vacancies));
    }
}
