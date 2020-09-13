// Создать XML файл со структурой: ...
// Создать класс AnimalParser.
// Вывести в консоль name, breed всех котов используя любой из рассматриваемых ранее парсеров.

package add_task.var2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class AnimalParser {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork" +
                    "\\Lesson 11\\src\\add_task\\var2\\1.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            // Получаем объект DocumentBuilder
            DocumentBuilder db = dbf.newDocumentBuilder();

            // Парсим объект DocumentBuilder и получаем объект Document
            Document doc = db.parse(xmlFile);

            // Возвращает объект класса Element, получаем корневой элемент
            Element root = doc.getDocumentElement();
            System.out.println("Корневой элемент: " + root.getNodeName());
            System.out.println("----------------------");

            // Для корневого элемента вызываем метод getChildNodes
            NodeList nl = root.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {
                // По номеру получаем узел
                Node node = nl.item(i);
                // Проверяем определенный тип, если узел является элементом, то входим в тело
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Animal:");
                    System.out.println("Animal name: " + element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Breed: " + element.getElementsByTagName("breed").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("----------------------");
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
