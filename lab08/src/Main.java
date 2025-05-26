import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("podaj wartość z ktorej chcesz policzyc silnie: ");
                int n = scanner.nextInt();
                Silnia silnia = new Silnia();
                long wynik = silnia.silnia(n);
                System.out.println("silnia z " + n + " to: " + wynik);
                break;
            } catch (BlednaWartoscDlaSilni e) {
                System.out.println(e.getMessage());
            }
        }

    }
}