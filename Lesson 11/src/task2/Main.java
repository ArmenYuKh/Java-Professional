// Создайте класс, используя SAXParser, в котором опишите иерархию XML файла.
// Необходимо, чтобы проект создавал XML файл и строил дерево (город, название улицы, дом).
// В городе используйте аттрибут(например, <city size=”big>Kiev</city>).


package task2;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) throws XMLStreamException, IOException {
        File file = new File("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 11\\src\\task2\\1.xml");
        if (file.createNewFile()) {
            System.out.println(" Файл создан");
        } else {
            System.out.println("Файл уже существует");

            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = outputFactory.createXMLStreamWriter(new FileWriter(file));

            writer.writeStartDocument("1.0");
            writer.writeStartElement("city");
            writer.writeAttribute("size", "big");
            writer.writeCharacters("Moscow");

            writer.writeStartElement("street");
            writer.writeCharacters("Aviamotornaya");
            writer.writeEndElement();

            writer.writeStartElement("building");
            writer.writeCharacters("10");
            writer.writeEndElement();

            writer.writeEndElement();
            writer.writeEndDocument();

            writer.flush();
            writer.close();
        }
    }
}
