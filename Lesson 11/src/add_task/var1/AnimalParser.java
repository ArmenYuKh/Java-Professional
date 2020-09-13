// Создать XML файл со структурой: ...
// Создать класс AnimalParser.
// Вывести в консоль name, breed всех котов используя любой из рассматриваемых ранее парсеров.

package add_task.var1;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

public class AnimalParser {
    private String xml;

    public AnimalParser (String path) {
        byte[] buf = null;
        RandomAccessFile file = null;

        try {
            // RandomAccessFile, конструктор принимает 2 параметра, путь и имя файлового потока
            file = new RandomAccessFile(path, "r");
            buf = new byte[(int)file.length()];
            file.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            xml = new String(buf, "US-ASCII");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public String get (String path) {
        // Разбиваем /
        String[] parts = path.split("/");
        String s_xml = xml;

        for (String s : parts) {
            String toFind = "<" + s + ">";
            // start начинается с 1 символа найденного тега
            int start = s_xml.indexOf(toFind);
            if (start < 0) {
                return null;
            } else {
                start += toFind.length();
            }

            // Находим закрывающийся тег
            int end = s_xml.lastIndexOf("</" + s + ">");
            if (end < 0) {
                return null;
            }
            // Вырезаем найденную строку
            s_xml = s_xml.substring(start, end);
        }
        return s_xml;
    }

}
