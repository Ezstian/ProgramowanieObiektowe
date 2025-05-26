import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.IllegalArgumentException;
import java.lang.Math;

class Exception1{
    public static void main(String[] args) {
        System.out.println("Podaj liczbę do spierwiatkowania: ");
        Scanner scanner = new Scanner(System.in);
        double liczbaPierwiastka=0;
        while (true) {
            try {
                liczbaPierwiastka = scanner.nextDouble();
                if (liczbaPierwiastka < 0) {
                    throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby: "+liczbaPierwiastka+ " nie istnieje"));}
                break;
            } catch (InputMismatchException e) {
                System.out.println("Błąd wpisania.");
                throw new IllegalArgumentException(String.format("podany został znak zamiast liczby"));
            }
        }
        System.out.println("Pierwiastek kwadratowy z liczby: "+liczbaPierwiastka+" = "+Math.sqrt(liczbaPierwiastka));
    }

}

