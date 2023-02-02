package patterns.behavioral.chain;

public class Runner {
    public static void main(String[] args) {
        Notifier reportNotifier=new SimpleReportNotifier(Priority.ROUTINE.getPriority());
        Notifier emailNotifier=new EmailNotifier(Priority.IMPORTANT.getPriority());
        Notifier smsNotifier=new SMSNotifier(Priority.ASAP.getPriority());

        reportNotifier.setNotifier(emailNotifier);
        emailNotifier.setNotifier(smsNotifier);

        reportNotifier.notifyManager("OK. ",Priority.ROUTINE.getPriority());
        reportNotifier.notifyManager("Trouble. ",Priority.IMPORTANT.getPriority());
        reportNotifier.notifyManager("Pass away. ",Priority.ASAP.getPriority());

    }
}
