package jdk12;

/**
 * @author Soumen Karmakar
 * 14/05/2020
 */
public class SwithChanges {
    public static void main(String[] args) {
        Day day = Day.FRIDAY;
        boolean isWeekend = switch (day){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
            case SATURDAY, SUNDAY -> true;
            default -> throw new IllegalStateException("Illegal day entry :: " + day);
        }
    }
    enum Day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }
}
