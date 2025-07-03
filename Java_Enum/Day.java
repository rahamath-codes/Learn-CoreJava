package Java_Enum;
/*
Java, an enum (enumeration) is a special class that represents a group of constants (fixed set of values).
It was introduced in Java 5.
*/
public enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum Planet {
    EARTH(5.97), MARS(0.642), JUPITER(1898);

    private final double mass; // in 10^24 kg

    // Constructor
    Planet(double mass) {
        this.mass = mass;
    }

    // Method
    public double getMass() {
        return mass;
    }
}

/*
| Feature             | Enum                                |
| ------------------- | ----------------------------------- |
| Type-safe?          |  Yes                               	|
| Can have methods?   |  Yes                               	|
| Can extend classes? |  No (but can implement interfaces) 	|
| Use case            | Constants like days, colors, status |
 */