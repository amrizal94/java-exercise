/**
 * Convert string to camel case
 * 
 * @apiNote
 *          Complete the method/function so that it converts dash/underscore
 *          delimited words into camel casing.
 *          The first word within the output should be capitalized only if the
 *          original word was capitalized (known as Upper Camel Case, also often
 *          referred to as Pascal case).
 *          The next words should be always capitalized.
 * 
 * @Examples
 *           "the-stealth-warrior" gets converted to "theStealthWarrior"
 * 
 *           "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 * 
 *           "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */
public class CamelCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
        System.out.println(toCamelCase("The_Stealth-Warrior"));
    }

    static String toCamelCase(String s) {
        // list characters want be converted
        String regex = "[-_]";
        String[] words = s.split(regex);
        // keep only first word
        s = words[0];
        for (int i = 1; i < words.length; i++) {
            // upper case first character only after the first word
            s = s + words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }
        return s;
    }

}