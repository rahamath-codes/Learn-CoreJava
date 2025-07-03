package Java_Enum;

public class PlanetEnumDemo {
	public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.println(p + " has mass " + p.getMass() + " x10^24 kg");
        }
    }
}
