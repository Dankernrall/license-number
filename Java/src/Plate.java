import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Plate {
    public Matcher plateGetter(String get) {
        Pattern pat = Pattern.compile("[АВЕКМНОРСТУХAVEKMNORSTYH][0-9]{3}[АВЕКМНОРСТУХAVEKMNORSTYH]{2}[0-9]{2,3}$");
        Matcher mat = pat.matcher(get); //Задаем регулярное выражение под необходимый формат номера
        try {
            if (mat.matches()) {//Если номер подходит под формат
            } else {
                throw new IllegalArgumentException("Неверный формат или регион!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return (mat);
    }
}
