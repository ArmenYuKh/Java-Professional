// Создать 2 класса. Реализовать взаимную блокировку(deadlock) этих классов.


package task2;

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
        synchronized (ThreadA.class) {
            System.out.println("Поток 1: удерживание A");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток 1: ожидание B");

            synchronized (ThreadB.class) {
                System.out.println("Поток 1: удерживание A и B");
            }
        }
    }
}

class ThreadB extends Thread {
    @Override
    public void run() {
        synchronized (ThreadB.class) {
            System.out.println("Поток 2: удерживание B");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток 2: ожидание A");

            synchronized (ThreadA.class) {
                System.out.println("Поток 2: удерживание A и B");
            }
        }
    }
}
