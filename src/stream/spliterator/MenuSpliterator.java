package stream.spliterator;

import java.util.Date;
import java.util.List;

public class MenuSpliterator {
    public static void run() {
        Date date = new Date();

        MessageRecord record1 = new MessageRecord(4, date, "Hello");
        MessageRecord record2 = new MessageRecord(1, date, "I");
        MessageRecord record3 = new MessageRecord(3, date, "found of");
        MessageRecord record4 = new MessageRecord(8, date, "Java");
        MessageRecord record5 = new MessageRecord(6, date, "and");
        MessageRecord record6 = new MessageRecord(9, date, "looking");
        MessageRecord record7 = new MessageRecord(6, date, "for");
        MessageRecord record8 = new MessageRecord(5, date, "job");

        Messages messages = new Messages();

        messages.addMessage(record1);
        messages.addMessage(record2);
        messages.addMessage(record3);
        messages.addMessage(record4);
        messages.addMessage(record5);
        messages.addMessage(record6);
        messages.addMessage(record7);
        messages.addMessage(record8);

        List<MessageRecord> recordList = messages.stream()
                .filter(a -> a.getUserId() > 3).toList();

        System.out.println(recordList);
    }
}
