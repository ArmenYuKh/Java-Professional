// Создать класс Bird.
// Создать 3 поля (static, final и transient), методы, конструктор.
// Клонировать объект используя глубокое клонирование через сериализацию

package task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Bird swan = new Bird("Swan", 2);

        ByteArrayOutputStream byteOutput = null;
        ByteArrayInputStream byteInput = null;

        ObjectOutputStream output = null;
        ObjectInputStream input = null;

        try {
            byteOutput = new ByteArrayOutputStream();
            output = new ObjectOutputStream(byteOutput);
            output.writeObject(swan);

            byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
            input = new ObjectInputStream(byteInput);

            Bird cloneSwan = (Bird) input.readObject();

            System.out.println(swan);
            System.out.println(cloneSwan);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (byteOutput != null) {
                try {
                    byteOutput.flush();
                    byteOutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(byteInput != null) {
                try {
                    byteInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(output != null) {
                try {
                    output.flush();
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
