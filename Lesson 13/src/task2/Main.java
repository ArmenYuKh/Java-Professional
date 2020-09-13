// Задержка потока.
// Необходимо создать 3 потока, каждых из этих потоков запустить (например: main, second, first),
// и когда эти потоки успешно отработают – вывести на экран сообщение (завершение потом first, second и main).

package task2;

public class Main extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Main());
        t1.setName("main");
        t1.start();

        Thread t2 = new Thread(new FirstThread());
        t2.setName("first");
        t2.start();

        Thread t3 = new Thread(new SecondThread());
        t3.setName("second");
        t3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            Thread.currentThread().setName("main");
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("Завершение main");
    }
}

class FirstThread extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("first");
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("Завершение first");
    }

}

class SecondThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("Завершение second");
    }
}

