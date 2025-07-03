package Java_Enum;

import java.util.Arrays;

public class EnumDemo {
	public static void main(String[] args) {
        Day today = Day.SATURDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of work week");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek day");
        }
        
        //Common Enum methods
        Day d = Day.valueOf("MONDAY");  // MONDAY
        int index = d.ordinal();        // 0
        Day[] days = Day.values();      // All constants
        System.out.println(d);
        System.out.println(index);
        System.out.println(Arrays.toString(days));
    }
}
/*
| Method            | Description                           |
| ----------------- | ------------------------------------- |
| `values()`        | Returns all enum constants as array   |
| `valueOf("NAME")` | Returns enum constant with given name |
| `ordinal()`       | Returns position (index)              |
*/
