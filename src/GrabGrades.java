import java.util.Scanner;

public class GrabGrades {
    public static Float GrabGrades(String vak) {
        Scanner scannerObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("SE cijfer voor " + vak + " aub: ");

        String vakSE = scannerObj.nextLine();  // Read user input
        System.out.println("SE-cijfer " + vak + ": " + vakSE);  // Output user input
        return Float.parseFloat(vakSE);
    }
}
