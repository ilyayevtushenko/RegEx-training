import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pipeline
 */
public class Lesson6 {

    public void first() {
        Pattern p = Pattern.compile("cat|dog"); //найти либо cat либо dog

        Matcher m = p.matcher("I like my dog");

        while(m.find()) {
            System.out.print(m.group());
        }
        System.out.println("");
    }

    public void second() {
        Pattern p = Pattern.compile("Get|GetValue|Set|SetValue"); //найдет по порядку )первый Set)
        Pattern p1 = Pattern.compile("GetValue|Get|SetValue|Set"); // найдет SetValue
        Pattern p2 = Pattern.compile("Get(Value)|Set(Value)"); // найдет SetValue
        Pattern p3 = Pattern.compile("\\b(Get|GetValue|Set|SetValue)\\b"); // найдет SetValue
        Pattern p4 = Pattern.compile("\\b(Get(Value)?|Set(Value)?)\\b"); // найдет SetValue
        Pattern p5= Pattern.compile("\\b(Get|Set)(Value)?\\b"); // найдет SetValue


        Matcher m = p5.matcher("SetValue");

        while(m.find()) {
            System.out.print(m.group());
        }
        System.out.println("");
    }
}
