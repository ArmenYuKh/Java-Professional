// Изменить задание №2. Всеми возможными способами (которые Вы знаете) решить проблему взаимной блокировки.

package task3.Method1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        a.start();
        a.join(); //В этом случае второй поток еще не запущен, поэтому метод join() на нем сразу же вернётся и
        // первый поток будет завершён. Второй поток так же завершится, потому что вызов метода join() на первом
        // потоке, который уже завершился, мгновенно завершится.
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