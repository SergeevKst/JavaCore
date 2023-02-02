package multithreading.concurrent;


import javax.naming.InsufficientResourcesException;
import java.util.concurrent.TimeUnit;

public class Operations {
    public static void main(String[] args) {
        Account a = new Account(1000);
        Account b = new Account(1000);

        new Thread(() -> {
            try {
                transfer(a, b, 500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        try {
            transfer(b, a, 500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private static void transfer(Account a, Account b, int price) throws InterruptedException {
        if (a.getBalance() < price)
            try {
                throw new InsufficientResourcesException();
            } catch (InsufficientResourcesException e) {
                throw new RuntimeException(e);
            }

        /*
        Данные операции не атомарны, решить поблему можно при помощи двух блоков synchronized
        которые захватят монитор каждого из Account но данный способ может привести к DeadLock
        Решение:
         */

        if (a.getLock().tryLock(15, TimeUnit.SECONDS)) {
            try {
                if (b.getLock().tryLock(15, TimeUnit.SECONDS)) {
                    try {
                        a.withdraw(price);
                        System.out.println("Balance account a: " + a.getBalance());

                        b.deposit(price);
                        System.out.println("Balance account b: " + b.getBalance());
                    } finally {
                        a.getLock().unlock();
                    }
                } else b.countFail();
            } finally {
                b.getLock().unlock();
            }
        } else a.countFail();

        System.out.println("Transfer success");
        System.out.println("Number of fail: " + a.getFailCounter());
    }
}