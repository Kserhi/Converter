package converter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Один кілометер це "+kmToMile(1)+" миля");
    }

    public static double kmToMile(double km){
        return km/1.6;
    }
}
