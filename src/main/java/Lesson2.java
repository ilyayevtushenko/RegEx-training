import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson2 {
    public void first() {
        //]\^-
        Pattern p = Pattern.compile("[a-c0-5A-Z]");
        Matcher m = p.matcher("abcdcAA174B");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }

    public void second() {
        Pattern p = Pattern.compile("gr[ae]y");
        Matcher m = p.matcher("grey"); //gray would also work

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }

    public void third() {
        //]\^- (meta characters inside [] brackets)
        // ^ = отрицание
        // - = промежуток
        // ] = закрытие
        // \\ - эканирование
        Pattern p = Pattern.compile("q[^u]"); // найти q после которой НЕ следует u
        Matcher m = p.matcher("Iraq is a country");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }

    public void fourth() {
        Pattern p = Pattern.compile("\\Q[-]\\E");
        Matcher m = p.matcher("[ bla - asd ]");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println(" ");
    }


    /**Predefined characters
     * \d = [0-9]        \D = [^d\]  все цифры | все НЕ цифры
     * \w = [a-zA-Z0-9 ] \W = [^w\]  все большие, маленькие буквы, цифры | все НЕ
     * \s = [ \t]        \S = [^s\]  все пробелы, табуляции | все НЕ пробелы, табуляции
     *
     * Examples
     * [\\s\\d] - или пробел или цифра
     * \\s\\d   - найдет пробел, за которым будет идти цифра
     *
     * \\D\\S   - найдёт все что угодно (что является не цифрой ИЛИ не пробелом)
     */
    public void fifth() {
        Pattern p = Pattern.compile("\\w");
        Matcher m = p.matcher("[alkcjbasd]");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println(" ");
    }

}
