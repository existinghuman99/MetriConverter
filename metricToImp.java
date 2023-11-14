import java.util.Scanner;

public class metricToImp {
        static void converterInteractive() { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter measurement in Feet to be converted to Meters");
        double input = s.nextDouble();
        System.out.println(input/3.28084);
        //for the future
        //return output = input/3.28084;
    }
    static double feetToMeters(double feet) {
        return feet/3.28084;
    }
    static double inchesToCentimeters(double inches) {
        return inches*2.54;
    }
    static double milesToKilometers(double miles){
        return miles*1.609344;
    }
}