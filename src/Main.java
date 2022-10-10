import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter username: ");
        Scanner ulaz = new Scanner(System.in);
        String username = ulaz.nextLine();
        System.out.println("Hello " + username);
    }
}
