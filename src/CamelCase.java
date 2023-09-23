/**
 * CamelCase
 */
public class CamelCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }

    static String toCamelCase(String s) {
        String regex = "[-_]";
        String[] words = s.split(regex);
        s = words[0];
        for (int i = 1; i < words.length; i++) {
            s = s + words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }
        return s;
    }

}