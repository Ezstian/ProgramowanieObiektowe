
import java.util.*;
public class Main {
    public enum Swiatlo{
        CZERWONE("Stop!"),ZOLTE("Uwaga"),ZIELONE("jedz");
        private String opis;

        Swiatlo(String opis) {
            this.opis = opis;
        }
        public String getKomunikat(){
            return opis;
        }
    }
    public enum Pizza{
        MALA(13),SREDNIA(17),DUZA(20);
        private int srednica;

        Pizza(int srednica) {
            this.srednica = srednica;
        }
        public int getCena(){
            switch (srednica){
                case 13:
                    return 20;
                case 17:
                    return 30;
                case 20:
                    return 40;
            }
            return 0;
        }

        @Override
        public String toString() {
            return "Pizza{" +
                    "srednica=" + srednica +
                    '}';
        }
    }
    public static void main(String[] args) {
        Swiatlo status = Swiatlo.CZERWONE;
        System.out.println(status.getKomunikat());
        Pizza rozmiar = Pizza.MALA;
        System.out.print(rozmiar);
    }
}