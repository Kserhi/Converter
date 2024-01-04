package converter;

public class Main {
    public static void main(String[] args) {

        System.out.println("Одна миля це "+mileToKm(1)+" кілометер");

    }

    public static double mileToKm(double mile){
        return mile*1.6;
    }

}
