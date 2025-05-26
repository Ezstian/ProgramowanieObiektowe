import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figura figura = new Figura("red") {
            @Override
            String opis() {
                return "Obiekt klasy figura";
            }

            @Override
            void skaluj(float skala) {

            }
        };

        Kwadrat kwadrat = new Kwadrat(5,"niebieski");
        Prostokat prostokat = new Prostokat(3,4,"czerwony");
        Trojkat trojkat = new Trojkat(3,5, "biały");
        Punkt punkt = new Punkt(1,1);

        System.out.println(figura.opis());
        System.out.println(kwadrat.opis());
        System.out.println(prostokat.opis());
        System.out.println(punkt.x);

        Figura[] tablicaFigur = new Figura[10];
        Arrays.fill(tablicaFigur, figura);
        for(Figura x : tablicaFigur) System.out.println(x.opis());

        List<IFigury> listaFigur = new ArrayList<IFigury>();
        listaFigur.add(kwadrat);
        listaFigur.add(prostokat);
        listaFigur.add(trojkat);
        for(IFigury x : listaFigur){
            System.out.println(x.getPowierzchnia());
            System.out.println(x.wPolu(new Punkt(0,0)));
        }

        Okrag okrag = new Okrag(10);
        System.out.println(okrag.opis());
        okrag.przesun(3,5);
        System.out.println(okrag.punkt.x);
        System.out.println(okrag.punkt.y);
    }
}