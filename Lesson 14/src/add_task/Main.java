// Создайте поток-демон и выведите про него как можно больше информации.

package add_task;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Daemon daemon = new Daemon();

        daemon.setDaemon(true);
        System.out.println("Имя демона-потока: " + daemon.getName());
        daemon.setName("daemon-thread");
        System.out.println("Новое имя демона-потока: " + daemon.getName());

        daemon.setPriority(2);
        daemon.start();

        sleep(1000);
        daemon.interrupt();
        if (daemon.isInterrupted()) {
            System.out.println("Поток-демон был прерван!");
        }
    }
}

class Daemon extends Thread {
    @Override
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("\nПоток является потоком-демоном.");
            }
            System.out.println("Старт потока-демона");
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Завершение работы потока-демона");
        }
    }
}
