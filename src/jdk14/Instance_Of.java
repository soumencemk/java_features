package jdk14;

/**
 * @author Soumen Karmakar
 * 14/05/2020
 */
public class Instance_Of {

    public static void main(String[] args) {
        Object obj = "abc";
        if (obj instanceof String str && str.length() > 5) {

        }
    }
}
