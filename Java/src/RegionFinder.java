import java.util.regex.Matcher;

public class RegionFinder {
    private int find = 0;
    private int region;

    public void findRegion(Matcher mat) {
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
    }
}
