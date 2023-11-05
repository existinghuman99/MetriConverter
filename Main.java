import java.util.Scanner;
public class Main {
    static void converterInteractive() { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter measurement in Feet to be converted to Meters");
        double input = s.nextDouble();
        System.out.println(input/3.28084);
        //for the future
        //return output = input/3.28084;
    }
    public static void main(String[] args) {
        converterInteractive();
    }
}

