import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Word Boundaries
 * Границы слов
 */
public class Lesson4 {
    public void first() {
        // \b \bbird\b  \B
        // \b\w+\b
        Pattern p = Pattern.compile("\\bis\\b");
        Matcher m = p.matcher("This island is beautiful");

        while(m.find()) {
            System.out.print(m.group());
        }
        System.out.println("");
    }
}
