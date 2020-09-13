// Создать 2 произвольных класса с полями и методами.
// Необходимо синхронизировать методы этих классов между собой, т.е. чтобы выводило на
// экран значения друг за другом (1 класс, 2 класс, 1, 2 и т.д.).


package add_task;

public class Main {
    public static void main(String[] args) {
        Show s = new Show();
        A a = new A(s, 4);
        B b = new B(s,4);

        a.start();
        b.start();
    }
}

class Show {
    int id;
    boolean isFinished;

    synchronized void showA (int id) {
        if (isFinished) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.id = id;
        System.out.println("Метод из класса A: " + this.id);
        isFinished = true;
        notify();
    }

    synchronized void showB () {
        if (!isFinished) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Метод из класса B: " + this.id);
        isFinished = false;
        notify();
    }
}

class A extends Thread{
    Show s;
    int count;

    A (Show s, int count) {
        this.s = s;
        this.count = count;
    }

    void show (int id) {
        s.showA(id);
    }

    @Override
    public void run() {
        for (int i = 1; i < count + 1; i++) {
            show(i);
        }
    }
}

class B extends Thread{
    int count;
    Show s;

    B (Show s, int count) {
        this.s = s;
        this.count = count;
    }

    void show () {
        s.showB();
    }

    @Override
    public void run() {
        for (int i = 1; i < count + 1; i++) {
            show();
        }
    }
}

