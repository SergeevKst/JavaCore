package multithreading.concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int balance;
    private final AtomicInteger failCounter = new AtomicInteger(0);

    private final Lock lock;

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void countFail() {
        failCounter.incrementAndGet();
    }

    public Account(int balance) {
        this.balance = balance;
        this.lock = new ReentrantLock();
    }

    public int getBalance() {
        return balance;
    }

    public AtomicInteger getFailCounter() {
        return failCounter;
    }

    public Lock getLock() {
        return lock;
    }
}
