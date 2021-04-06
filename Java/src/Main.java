import java.util.Scanner;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String get;
        Plate plate = new Plate();
        Menu menu = new Menu();
        int find = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер:");
        get = in.nextLine()
                .replaceAll(" ", "")
                .toUpperCase()
                .replaceAll("RUS", "")
                .replaceAll("РУС", ""); //Делаем номер прописными буквами и удаляем все лишние пробелы и "RUS"
        Matcher mat = plate.plateGetter(get);
        try {
            if (mat.matches()) {
            } else {
                throw new IllegalArgumentException("Неверный формат или регион!");

            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        menu.startMenu(in,mat);

    }
}