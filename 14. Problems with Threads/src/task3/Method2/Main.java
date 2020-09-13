// Изменить задание №2. Всеми возможными способами (которые Вы знаете) решить проблему взаимной блокировки.

package task3.Method2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        a.start();
        b.start();
    }
}

class ThreadA extends Thread {
    @Override
    public void run() {
        Lock reentrantLock = new ReentrantLock();
        synchronized (ThreadA.class) {
            System.out.println("Поток 1: удерживание A");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток 1: ожидание B");

            reentrantLock.lock();
            try {
//                synchronized (ThreadB.class) {
                    System.out.println("Поток 1: удерживание A и B");
//                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}

class ThreadB extends Thread {
    @Override
    public void run() {
        Lock reentrantLock = new ReentrantLock();

        synchronized (ThreadB.class) {
            System.out.println("Поток 2: удерживание B");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток 2: ожидание A");

            reentrantLock.lock();
            try {
//                synchronized (ThreadA.class) {
                    System.out.println("Поток 2: удерживание A и B");
//                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}