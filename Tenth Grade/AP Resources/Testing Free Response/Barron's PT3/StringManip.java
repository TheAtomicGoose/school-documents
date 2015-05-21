import java.util.*;

public class StringManip {

    public static String replaceAll(String line, String sub, String repl) {

        String replaced = "";
        int length = sub.length();
        while (line.indexOf(sub) >= 0) {
            int pos = line.indexOf(sub);
            replaced += line.substring(0, pos);
            replaced += repl;
            line = line.substring(pos + length);
        }
        replaced += line;
        return replaced;
    }

    public static void main(String[] args) {
        System.out.println(replaceAll("sing to me a sin", "sin", "brin"));
    }
}