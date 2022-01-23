import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Optional Items
 */
public class Lesson7 {
    public void first() {
        Pattern p = Pattern.compile("colou?r"); // u? = u-опицональный (может быть а может не быть)

        Matcher m = p.matcher("color colour");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }

    /**
     * ? - greedy
     * ?? - lazy
     */
    public void second() {
        // u? = u-опицональный (может быть а может не быть)
        Pattern p = Pattern.compile("Nov(ember)?");  // November Nov
        Pattern p2 = Pattern.compile("Nov(ember)??"); // Nov Nov

        Matcher m = p.matcher("November Nov");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println(" ");
    }

    public void third() {
        //February 23rd February 23 Feb 23rd Feb 23
        Pattern p = Pattern.compile("Feb(ruary)? 23(rd)?");

        Matcher m = p.matcher("February 23rd, February 23, Feb 23rd, Feb 23");

        while(m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }
}
