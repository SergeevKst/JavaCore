package stream.spliterator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageRecord {
    private final int userId;
    private final Date sentDate;
    private final String text;
    public static final int SIZE = 100;

    public MessageRecord(int userId, Date sentDate, String text) {
        this.userId = userId;
        this.sentDate = sentDate;
        this.text = text;
    }

    public static MessageRecord formString(String text) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd:MM:yyyy");
        int id = Integer.parseInt(text.substring(0, 9).replace(" ", ""));
        Date date;

        try {
            date = simpleDateFormat.parse(text.substring(10, 20));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        String message = text.substring(21).stripTrailing();
        return new MessageRecord(id, date, message);
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd:MM:yyyy");
        return String.format("%9d|%10.10s|%-79.97s", userId, simpleDateFormat.format(sentDate), text);
    }
}
