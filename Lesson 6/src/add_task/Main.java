// Напишите консольное приложение, позволяющие пользователю зарегистрироваться под «Логином»,
// состоящем только из символов латинского алфавита, и пароля, состоящего из цифр и символов.

package add_task;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        Scanner password = new Scanner(System.in);

        System.out.println("Введите ваш логин:");
        Pattern p1 = Pattern.compile("[a-zA-Z]+");
        String s1 = login.next();
        Matcher m1 = p1.matcher(s1);
        boolean b1 = m1.matches();

        if (b1) {
            System.out.println("Введите ваш пароль:");
            Pattern p2 = Pattern.compile("\\d+\\W+");
            String s2 = password.next();
            Matcher m2 = p2.matcher(s2);
            boolean b2 = m2.matches();
            if (b2) {
                System.out.println("Ваши регистрационные данные: ");
                System.out.println("Логин: " + s1);
                System.out.println("Пароль: " + s2);
            }
            else {
                System.out.println("Вы ввели неверный пароль. Повторите попытку. Пароль должен состоять только из цифр и символов!");
            }
        }
        else {
            System.out.println("Вы ввели неверный логин. Повторите попытку. Логин должен состоять только из символов латинского алфавита!");
        }
    }
}
