// Напишите шуточную программу «Дешифратор», которая бы в текстовом файле могла бы заменить все предлоги на слово «Java».

package task2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecoderMethod2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 6\\src\\task2\\Text.txt");
        DataInputStream dis = new DataInputStream(new FileInputStream(f1));
        byte[] bytes = new byte[dis.available()];
        dis.readFully(bytes);
        String fileContents = new String(bytes, 0, bytes.length);
        System.out.println(fileContents);
        System.out.println("===============\n");

        StringBuilder sb = new StringBuilder();
        String[] splitWord = fileContents.split(" ");

        // Предлоги в тексте: с, в
        for (String s : splitWord) {
            String tmp = s;
            Pattern p = Pattern.compile("с|в|на", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
            Matcher m = p.matcher(tmp);
            boolean b = m.matches();
            if (b) {
                tmp = "Java";
                sb.append(tmp).append(" ");
            } else sb.append(tmp).append(" ");

            System.out.println(sb);
        }

        File f2 = new File("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 6\\src\\task2\\Decoded text.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(f2,false));
        pw.println(sb);
        pw.flush();
        pw.close();
    }
}
