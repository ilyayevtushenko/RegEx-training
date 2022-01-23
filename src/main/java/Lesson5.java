import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Anchors
 */
public class Lesson5 {

    /**
     * ^ - символ начала строки
     * $ - символ конца строки
     */
    public void first() {
        Pattern p = Pattern.compile("^a"); //найти те строчки которые начинаются с а
        Pattern p1 = Pattern.compile("^b"); //найти те строчки которые начинаются с b

        Matcher m = p.matcher("abc");

        while(m.find()) {
            System.out.print(m.group());
        }
        System.out.println("");
    }

    public void second() {
        Pattern p = Pattern.compile("c$"); //найти те строчки которые заканчиваются на с
        Pattern p1 = Pattern.compile("b$"); //найти те строчки которые заканчиваются на b

        Matcher m = p.matcher("abc");

        while(m.find()) {
            System.out.print(m.group());
        }
        System.out.println("");
    }
    public void third() {
        //найти от начала (^) и до конца ($) строки, чтобы это были только цифры (\\d+)
        Pattern p = Pattern.compile("^\\d+$");

        Matcher m = p.matcher("12345");

        while (m.find()) {
            System.out.print(m.group());
        }
        System.out.println("");
    }

    /**
     * \\A = начало строки ^
     * \\Z = конец строки $
     * \\z = конец строки $ но учитывает \n (перенос строки)
     */
    public void fourth(){
        //найти все строчки которые заканчиваются на ne
        Pattern p = Pattern.compile("ne$", Pattern.MULTILINE);
        Matcher m = p.matcher("first line\nsecond line");

        while(m.find()) {
            System.out.print(m.group());
        }
        System.out.println("");
    }
}
