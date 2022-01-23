import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Звездочка или плюс - символы повторения
 */
public class Lesson8 {
    /**
     *  * = символ может быть повторен от 0 до беск. раз
     *  + = символ может быть повторен от 1 до беск. раз
     *  a+
     *  a*
     *
     *  {x,y} - символ может быть повторен от x до y раз
     *  [0-9] {1, 4} - находит числа от 0 до 9999
     */
    public void first() {
        Pattern p = Pattern.compile("[A-Za-z][A-za-z0-9]*"); // u? = u-опицональный (может быть а может не быть)

        Matcher m = p.matcher("<h1>");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }

    public void second() {
        //первая цифра 0-9 и потом от 2 до 4 цифр в промежутке 0-9
        // находит числа от 100 до 99999
        Pattern p = Pattern.compile("\\b[1-9][0-9]{2,4}\\b");

        Matcher m = p.matcher("100 99999");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }


}
