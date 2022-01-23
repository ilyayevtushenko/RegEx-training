import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson1 {

    /**
     * Find all "a" letters in a sentence
     */
    public void first() {
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("Jack is a boy");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }


    public void second() {
        Pattern p = Pattern.compile("cat");
        Matcher m = p.matcher("He captured a catfish for his cat");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }

    public void third() {
        //special characters - metacharacters
        //[]\^$.|?*+()

        //Pattern p = Pattern.compile("1\\+1=2");
        Pattern p = Pattern.compile("\\Q1+1=2\\E");
        Matcher m = p.matcher("1+1=2");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }
}
