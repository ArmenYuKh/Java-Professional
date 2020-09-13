//        Создайте в package текстовый файл и класc, внесите в файл некий текст.
//        Выведите на экран содержимое файла.

package add_task;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Создаём объект файла по ссылке
        File f1 = new File("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 4\\src\\add_task\\newFile.txt");

        //Считываем текстовый файл в нашем пакете
        BufferedReader br = new BufferedReader(new FileReader(f1));

        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter(f1,true));
        pw.println("Тестовая фраза");
        pw.flush();
        pw.close();
    }
}
