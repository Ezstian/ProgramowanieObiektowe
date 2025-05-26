public class Main {
    public static void main(String[] args) {
        Run run = new Run();
        RowerElektryczny rowerElektryczny1 = new RowerElektryczny(1,"Tesla",60);
        System.out.println(rowerElektryczny1);
        SamochodElektryczny samochodElektryczny1 = new SamochodElektryczny(2,"Volvo",100);
        System.out.println(samochodElektryczny1);

        run.wybor();
    }


}