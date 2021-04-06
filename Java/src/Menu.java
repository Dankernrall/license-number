import java.util.Scanner;
import java.util.regex.Matcher;

public class Menu {
    RegionFinder regionFinder = new RegionFinder();
    public void startMenu(Scanner in, Matcher mat){
        while (true) {
            System.out.println("Возможности меню:\n1) Показать регион\n2) Завершить работу");
            switch (in.nextInt()) {
                case 1:
                    regionFinder.findRegion(mat);
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
