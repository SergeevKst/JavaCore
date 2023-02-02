package stream.spliterator;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/*
Продемонстрирована возможность параллельной обработки структур данных
явно не предназначенной для этого
 */
public class Messages {
    private final StringBuilder sb = new StringBuilder();

    public void addMessage(MessageRecord record) {
        sb.append(record);
    }

    public Stream<MessageRecord> stream() {
        Spliterator<MessageRecord> spliterator = getSpliterator();
        return StreamSupport.stream(spliterator, false);
    }

    public Spliterator<MessageRecord> getSpliterator() {

        class Spl implements Spliterator<MessageRecord> {
            private int start;
            private final int end;

            public Spl(int start, int end) {
                this.start = start;
                this.end = end;
            }

            @Override
            public boolean tryAdvance(Consumer<? super MessageRecord> action) {
                if (start >= end) return false;
                MessageRecord messageRecord = MessageRecord
                        .formString(sb.substring(start * MessageRecord.SIZE, (start + 1) * MessageRecord.SIZE));

                action.accept(messageRecord);
                sb.replace(start * MessageRecord.SIZE, (start + 1) * MessageRecord.SIZE, messageRecord.toString());
                start += 1;
                return true;
            }

            @Override
            public Spliterator<MessageRecord> trySplit() {
                if (end - start < 2) return null;

                int middle = (end + start) / 2;

                Spliterator<MessageRecord> spliterator = new Spl(start, middle);
                start = middle;
                return spliterator;
            }

            @Override
            public long estimateSize() {
                return end - start;
            }

            @Override
            public int characteristics() {
                return Spliterator.SIZED | Spliterator.SUBSIZED | Spliterator.NONNULL;
            }
        }
        return new Spl(0, sb.length() / 100);
    }
}
