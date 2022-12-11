import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";
        String concat = string1.substring(0,2);
        String concat2 = string2.substring(string2.length()-2,string2.length());
        System.out.println(concat);
        System.out.println(concat2);
        String charArray = concat+concat2;
        System.out.println(charArray);

    }
}