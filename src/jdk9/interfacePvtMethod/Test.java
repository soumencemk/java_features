package jdk9.interfacePvtMethod;

/**
 * @author Soumen Karmakar
 * 14/05/2020
 */
public class Test implements CustomCalculator {

    public static void main(String[] args) {
        CustomCalculator customCalculator = new Test();
        int sumOfEvens = customCalculator.addEvenNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sumOfEvens);

        int sumOfOdds = customCalculator.addOddNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sumOfOdds);
    }
}
