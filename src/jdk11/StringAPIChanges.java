package jdk11;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Soumen Karmakar
 * 14/05/2020
 */
public class StringAPIChanges {
    public static void main(String[] args) {
        String str = "1".repeat(10);
        System.out.println(str);
        System.out.println("".isBlank());
        System.out.println("a".isBlank());
        System.out.println("   hi   ".strip());
        String testString = "hello\nworld\nis\nexecuted";
        List<String> collect = testString.lines().collect(Collectors.toList());
        System.out.println(collect);
    }
}
