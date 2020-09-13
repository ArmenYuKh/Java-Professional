// Создайте файл, запишите в него произвольные данные и закройте файл.
// Затем снова откройте этот файл, прочитайте из него данные и выведете их на консоль

package task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 4\\src\\task2\\dataOut.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 4\\src\\task2\\dataOut.txt")))) {
            out.writeShort(2300);
            out.writeInt(2458);
            out.writeLong(100L);
            out.writeUTF("Hello World!!!");
            out.flush();
            System.out.println("Short " + in.readShort());
            System.out.println("Int " + in.readInt());
            System.out.println("Long " + in.readLong());
            System.out.println("UTF " + in.readUTF());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
