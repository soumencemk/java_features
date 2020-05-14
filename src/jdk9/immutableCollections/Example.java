package jdk9.immutableCollections;

import java.util.List;

/**
 * @author Soumen Karmakar
 * 14/05/2020
 */
public class Example {

    public static void main(String[] args) {
        List<String> a = List.of("A", "B");
        System.out.println(a);
    }
}
