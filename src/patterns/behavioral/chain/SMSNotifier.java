package patterns.behavioral.chain;

import patterns.behavioral.chain.Notifier;

public class SMSNotifier extends Notifier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: "+message);
    }
}
