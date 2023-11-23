import java.util.Scanner;

public class Menu {
    static void runMenu() {
        // basic stuff & selection options

        System.out.println("🅜 🅔 🅣 🅡 🅘 🅒 🅞 🅝 🅥 🅔 🅡 🅣 🅔 🅡");
        System.out.println("");
        System.out.println("Conversion options:");
        System.out.println("1. Feet to Meters");
        System.out.println("2. Inches to Centimeters");
        System.out.println("3. Miles to Kilometers");
        System.out.println("");
        System.out.print("Your selection: ");
        
        // scanner stuff
        
        int menuSelection;
        Scanner ms = new Scanner(System.in);
        menuSelection = ms.nextInt();
        
        // selection

        double conversionInput;
        Scanner cs = new Scanner(System.in);
        conversionInput = cs.nextInt();

        if (menuSelection == 1) {
            System.out.println("");
            System.out.println("Enter value in feet to be converted to meters: ");
            conversionInput = cs.nextInt();
            //metricToImp.feetToMeters(conversionInput);
            System.out.println(metricToImp.feetToMeters(conversionInput));
        } else if (menuSelection == 2) {
            System.out.println("");
            System.out.println("Enter value in inches to be converted to centimeters: ");
            conversionInput = cs.nextInt();
            //metricToImp.inchesToCentimeters(conversionInput);
            System.out.println(metricToImp.inchesToCentimeters(conversionInput));
        } else if (menuSelection == 3) {
            System.out.println("");
            System.out.println("Enter value in miles to be converted to kilometers: ");
            conversionInput = cs.nextInt();
            //metricToImp.milesToKilometers(conversionInput);
            System.out.println(metricToImp.milesToKilometers(conversionInput));
        }
    }
}
