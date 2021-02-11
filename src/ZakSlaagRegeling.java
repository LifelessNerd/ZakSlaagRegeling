import java.util.HashMap;
import java.util.Scanner;

public class ZakSlaagRegeling {
    public static void main(String[] args) {
        //GrabGrades grabGradesObj = new GrabGrades();

        HashMap<String, Float> SECijfers = new HashMap<String, Float>();
        System.out.println("Eerst al je SE-cijfers. Formatteer als volgt: 6.4");

        SECijfers.put("entl", GrabGrades.GrabGrades("entl"));
        SECijfers.put("ges", GrabGrades.GrabGrades("ges"));
        SECijfers.put("ltc", GrabGrades.GrabGrades("ltc"));
        SECijfers.put("L&W", GrabGrades.GrabGrades("L&W"));
        SECijfers.put("maat", GrabGrades.GrabGrades("maat"));
        SECijfers.put("nat", GrabGrades.GrabGrades("nat"));
        SECijfers.put("nlt", GrabGrades.GrabGrades("nlt"));
        SECijfers.put("netl", GrabGrades.GrabGrades("netl"));
        SECijfers.put("schk", GrabGrades.GrabGrades("schk"));
        SECijfers.put("wisb", GrabGrades.GrabGrades("wisb"));
        SECijfers.put("PWS", GrabGrades.GrabGrades("PWS"));

        System.out.println(SECijfers);
    }
}
