package multithreading.concurrent;

import java.util.concurrent.*;

public class Operations2 {
    public static void main(String[] args) {
        ExecutorService executorService =
                Executors.newFixedThreadPool(3);

        Account a = new Account(1000);
        Account b = new Account(1000);

        ScheduledExecutorService scheduledExecutorService =
                Executors.newSingleThreadScheduledExecutor();

        CountDownLatch countDownLatch = new CountDownLatch(1);

        scheduledExecutorService.schedule(() ->
                        System.out.println("Fail: " + a.getFailCounter()),
                200,
                TimeUnit.SECONDS);

        for (int i = 0; i < 10; i++) {
            executorService.submit(
                    new Transfer(a, b, Math.round(400), i, countDownLatch));

            countDownLatch.countDown();
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
