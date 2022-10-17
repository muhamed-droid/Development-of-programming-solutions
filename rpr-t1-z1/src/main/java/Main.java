import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prvi broj: ");
        Scanner ulaz = new Scanner(System.in);
        int a= ulaz.nextInt();
        System.out.println("Drugi broj: ");
        int b= ulaz.nextInt();
        System.out.println("Prvi broj je: " + a + ", drugi " + b + ".");
    }
}
