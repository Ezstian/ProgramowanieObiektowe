import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    List<Pojazd> listaPojazdow;
    public Run(){
        listaPojazdow=new ArrayList<Pojazd>();

    }
    public void wybor(){

        int a;
        int wybor;
        String nazwa;
        int c;
        int b=1;
        double cena;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz akcje");
            System.out.println("1.dodaj pojazd\n" + "2.usuń pojazd\n" + "3.wypisz pojazdy\n" + "4.wypożyczanie pojazdu\n"+"5.Cena wypożyczenia pojazdu");
            a=new Scanner(System.in).nextInt();
            switch (a){
            case 1:
                System.out.println("Wybierz typ pojazdu:\n1.SamochodElektryczny\n2.RowerElektryczny");
                wybor=new Scanner(System.in).nextInt();
                if (wybor==1){
                    System.out.println("Podaj dane pojazdu");
                    System.out.println("ID:");
                    System.out.println(b);
                    System.out.println("Model:");
                    nazwa=new Scanner(System.in).next();
                    SamochodElektryczny samochodElektryczny2 = new SamochodElektryczny(b,nazwa,60);
                    System.out.println(samochodElektryczny2);
                    listaPojazdow.add(samochodElektryczny2);
                }else if (wybor==2){
                    System.out.println("Podaj dane pojazdu");
                    System.out.println("ID:");
                    System.out.println(b);
                    System.out.println("Model:");
                    nazwa=new Scanner(System.in).next();
                    RowerElektryczny rowerElektryczny2 = new RowerElektryczny(b,nazwa,60);
                    System.out.println(rowerElektryczny2);
                    listaPojazdow.add(rowerElektryczny2);
                }

                    break;
                case 2:
                    System.out.println("Podaj ID pojazdu którego chcesz usunąć: \n");
                    a=new Scanner(System.in).nextInt();
                    listaPojazdow.remove(a-1);
                    break;
                case 3:
                    for (Pojazd pojazd:listaPojazdow){
                        System.out.println(pojazd);
                    }
                    break;
                case 4:
                    System.out.println("Podaj ID pojazdu który chcesz wypożyczyć: \n");
                    c=new Scanner(System.in).nextInt();
                    listaPojazdow.get(c-1).czyDostępny=false;
                    break;
                case 5:
                    System.out.println("Podaj ilość dni wypożyczenia \n");
                    c=new Scanner(System.in).nextInt();
                    cena=c*238.35;
                    System.out.println("Cena wypożyczenia pojazdu wynosi: "+cena);
                    break;
                default:
            }
            b=b+1;
        }
        }



    }