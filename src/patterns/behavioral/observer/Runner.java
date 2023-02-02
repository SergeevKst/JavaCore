package patterns.behavioral.observer;

public class Runner {
    public static void main(String[] args) {

        JobSite site=new JobSite();

        site.addVacancies("The first");
        site.addVacancies("The second");

        Observer observer =new Subscriber("Konstantin");
        Observer observer1 =new Subscriber("Kst");

        site.addObserver(observer);
        site.addObserver(observer1);

        site.addVacancies("Java trainee developer");

        site.removeVacancies("The first");
    }
}
