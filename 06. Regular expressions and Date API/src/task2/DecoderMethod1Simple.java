// Напишите шуточную программу «Дешифратор», которая бы в текстовом файле могла бы заменить все предлоги на слово «Java».

package task2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecoderMethod1Simple {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 6\\src\\task2\\Text.txt");
        DataInputStream dis = new DataInputStream(new FileInputStream(f1));
        byte[] bytes = new byte[dis.available()];
        dis.readFully(bytes);
        String fileContents = new String(bytes, 0, bytes.length);
        System.out.println(fileContents);
        System.out.println("===============\n");

        String newFileContents = fileContents.replaceAll("с\\s|С\\s|в\\s|В\\s|на\\s|На\\s","Java ");

        System.out.println(newFileContents);

        File f2 = new File("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 6\\src\\task2\\Decoded text.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(f2,false));
        pw.println(fileContents);
        pw.flush();
        pw.close();
    }
}