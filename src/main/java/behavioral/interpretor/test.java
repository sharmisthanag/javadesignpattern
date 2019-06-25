package behavioral.interpretor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String input = "hello how are, khana khake jana";
        Pattern pattern=Pattern.compile("How|are");
        Matcher matcher=pattern.matcher(input);
        while (matcher.find())
        System.out.println(matcher.group());
    }
}
