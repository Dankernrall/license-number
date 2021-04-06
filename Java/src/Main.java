import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String get;
        Plate plate = new Plate();
        Menu menu = new Menu();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер:");
        get = in.nextLine()
                .replaceAll(" ", "")
                .toUpperCase()
                .replaceAll("RUS", "")
                .replaceAll("РУС", ""); //Делаем номер прописными буквами и удаляем все лишние пробелы и "RUS"
        menu.startMenu(in, plate.plateGetter(get)); //Запускаем меню

    }
}