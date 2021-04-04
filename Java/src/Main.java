import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String get;
        int region = 0;
        int find = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер:");
        get = in.nextLine()
                .replaceAll(" ", "")
                .toUpperCase()
                .replaceAll("RUS", "")
                .replaceAll("РУС", ""); //Делаем номер прописными буквами и удаляем все лишние пробелы и "RUS"
        Pattern pat = Pattern.compile("[АВЕКМНОРСТУХ][0-9]{3}[АВЕКМНОРСТУХ]{2}[0-9]{2,3}$"); //Задаем паттерн под необходимый
        Matcher mat = pat.matcher(get);                                         // нам формат номера
        try {
            if (mat.matches()) {
            } else {
                throw new IllegalArgumentException("Неверный формат или регион!");

            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        while (true) {
            System.out.println("Возможности меню:\n1) Показать регион\n2) Завершить работу");
            switch (in.nextInt()) {
                case 1:
                    region = Integer.parseInt(mat.group().substring(6)); //Вытаскиваем регион из номера
                    for (Regions s : Regions.values()) {
                        for (int i = 0; i < s.getValue().length; i++) { //Совершаем проход по Enum и ищем нужный регион
                            if (s.getValue()[i] == region) {
                                find = 1;                         //Переменная, контролировать отстутствие региона в Enum
                                System.out.println(s.getName() + "\n"); //Выводим имя региона при нахождении
                            }
                        }
                    }
                    if (find == 0) {
                        throw new IllegalArgumentException("Данный регион не поддерживается!");
                    }
                    break;
                case 2:
                    System.out.println("Выход...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Не правильный символ!");
                    break;
            }
        }
    }
}