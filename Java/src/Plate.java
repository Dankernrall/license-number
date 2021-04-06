import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Plate{
    public Matcher plateGetter(String get) {
        Pattern pat = Pattern.compile("[АВЕКМНОРСТУХ][0-9]{3}[АВЕКМНОРСТУХ]{2}[0-9]{2,3}$"); //Задаем паттерн под необходимый
        Matcher mat = pat.matcher(get);
        return(mat);
    }
}
