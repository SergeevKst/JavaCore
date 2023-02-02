package multithreading.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Transfer implements Callable<Boolean> {

    private final Account accountFrom;
    private final Account accountTo;
    private final int amount;

    private final int id;

    private final CountDownLatch countDownLatch;

    public Transfer(Account accountFrom, Account accountTo, int amount, int id, CountDownLatch countDownLatch) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public Boolean call() throws Exception {
        System.out.println("Waiting to start");
        countDownLatch.await();

        if (accountFrom.getBalance() < amount)
            try {
                throw new InvalidBalance("empty balance");
            } catch (InvalidBalance e) {
                System.err.println(e.getMessage());
                throw new RuntimeException(e);
            }

        if (accountFrom.getLock().tryLock(15, TimeUnit.SECONDS)) {
            try {
                if (accountTo.getLock().tryLock(15, TimeUnit.SECONDS)) {
                    try {
                        System.out.println("Tread: " + this.id + " start");
                        accountFrom.withdraw(amount);
                        Thread.sleep((long) (Math.random() * 10));
                        System.out.println("Balance account a: " + accountFrom.getBalance());

                        accountTo.deposit(amount);
                        Thread.sleep((long) (Math.random() * 10));
                        System.out.println("Balance account b: " + accountTo.getBalance());
                        System.out.println("Tread: " + this.id + " end");
                    } finally {
                        accountFrom.getLock().unlock();
                    }
                } else {
                    accountFrom.countFail();
                    return false;
                }
            } finally {
                accountTo.getLock().unlock();
            }
        } else {
            accountFrom.countFail();
            return false;
        }

        System.out.println("Transfer success");
        System.out.println("Number of fail: " + accountFrom.getFailCounter());
        return true;
    }

}
