import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Точка
 */
public class Lesson3 {

    /**
     * . = точка, любой символ, кроме конца строки ([^\n - unix, [^\r\n] - wibdows])
     * [- /.] - дефис пробел слеш или точка
     */
    public void first() {
        //mm//dd//yy
        Pattern p = Pattern.compile("[\\d\\d[- /.]\\d\\d[- /.]\\d\\d]");
        Matcher m = p.matcher("02/12/21");

        while(m.find()) {
            System.out.print(m.group());
        }
        System.out.println("");
    }

    public void second() {
        //  \".*\" = .* сколько угодно символов между кавычками ("")
        Pattern p = Pattern.compile(" \".*\"");
        Matcher m = p.matcher("Put a \"string\" between double quotes");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }

    public void third() {
        //  \".*\" = .* сколько угодно символов между кавычками ("")
        // [^\"\r\n] - что угодно кроме конца строки(\r\n) и других кавычек (")
        // *? - reluctant operator
        Pattern p = Pattern.compile("\"[^\"\r\n]*\"");
        Pattern p2 = Pattern.compile("\".*?\""); //would also work
        Matcher m = p2.matcher("Houston, we have a problem with \"string one\" and \"string two\". Please respond.");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }
}
