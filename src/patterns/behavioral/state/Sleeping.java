package patterns.behavioral.state;

public class Sleeping implements Activity{
    @Override
    public void doIt() {
        System.out.println("Sleep");
    }
}
