// Демонстрация приоритетов.
// Создать 2 класса PriorityRunner и PriorityThread.
// Запустить 3 потока с приоритетами (min, max, norm).
// При помощи цикла for выведем на экран значения от 1 до 50 и укажем, какой именно поток данную операцию делает.


package task3;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PriorityRunner());
        t1.setName("minPriorityRunner");
        t1.setPriority(1);
        t1.start();

        Thread t2 = new Thread(new PriorityRunner());
        t2.setName("maxPriorityRunner");
        t2.setPriority(10);
        t2.start();

        Thread t3 = new Thread(new PriorityRunner());
        t3.setName("normPriorityRunner");
        t3.setPriority(5);
        t3.start();

        Thread t4 = new Thread(new PriorityThread());
        t4.setName("minPriorityThread");
        t4.setPriority(1);
        t4.start();

        Thread t5 = new Thread(new PriorityThread());
        t5.setName("maxPriorityThread");
        t5.setPriority(10);
        t5.start();

        Thread t6 = new Thread(new PriorityThread());
        t6.setName("normPriorityThread");
        t6.setPriority(5);
        t6.start();
    }
}

class PriorityRunner implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class PriorityThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}


