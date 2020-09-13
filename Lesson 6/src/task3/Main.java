// Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты.
// С помощью этого метода выведите в консоль, сколько времени прошло с вашего дня рождения
// в удобном для восприятия виде, например: «Вам исполнилось 20 лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд».

package task3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Узнаем текущее время и переводим в нужный формат
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy"); // ("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String dayToday = dateFormat.format(cal.getTime());
        System.out.println("Текущая дата: " + dayToday);

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите Ваш День рождения в формате ДД.ММ.ГГГГ");
        String bDay = in1.next();

        Birthday(dayToday, bDay);
    }

    public static void Birthday(String dayToday, String bDay){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(bDay, formatter);
        LocalDate endDate = LocalDate.parse(dayToday, formatter);
        Period period = Period.between(startDate, endDate);
        System.out.println("С Вашего Дня рождения прошло " + period.getYears() + " лет, " + period.getMonths() + " месяцев, " + period.getDays() + " дней.");
    }
}

