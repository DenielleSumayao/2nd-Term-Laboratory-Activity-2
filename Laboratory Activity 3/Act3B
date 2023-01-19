//2. Given a string, compute recursively a new string where all the adiacent chars are now separated by a "*"
public class Lab3B {
    public static String addStars(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return str.charAt(0) + "*" + addStars(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(addStars("hello"));
    }
}
