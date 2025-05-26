abstract class Pojazd {
    boolean czyDostępny=true;
    String model;
    int id;

    public Pojazd(int id, String model){
        this.id = id;
        this.model = model;
    }
    public void wypożycz(){

    }
    public void zwroc(){

    }
    public boolean isCzyDostępny(){
        return czyDostępny;
    }

    public int getId() {
        return id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }
    public double obliczKoszt(){
        return 0;
    }
}
