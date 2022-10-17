import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter username: ");
        Scanner ulaz = new Scanner(System.in);
        String username = ulaz.nextLine();
        System.out.println("Hello " + username);
        String sDate1="31/12/1998";
        Date date1= null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Osoba osoba = new Osoba("Muhamed", "Masnopita", date1, true);
        System.out.println("Dobrodošli gospodine, vaši podaci su: " + osoba.toString());
    }
}
