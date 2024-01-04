package converter;

public class Main {
    public static void main(String[] args) {

        System.out.println("Один кілометер це " + kmToMile(1) + " миля");
        System.out.println("Одна миля це " + mileToKm(1) + " кілометер");

    }

    public static double mileToKm(double mile) {
        return mile * 1.6;
    }

    public static double kmToMile(double km) {
        return km / 1.6;
    }
}



