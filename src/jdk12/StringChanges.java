package jdk12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Soumen Karmakar
 * 14/05/2020
 */
public class StringChanges {
    public static void main(String[] args) {
        String result = "foo\nbar\nbar2".indent(4);
        System.out.println(result);

    }
}
