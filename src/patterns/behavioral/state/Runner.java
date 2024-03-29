package patterns.behavioral.state;

public class Runner {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();
        developer.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            developer.changeActivity();
            developer.justDoIt();
        }
    }
}
