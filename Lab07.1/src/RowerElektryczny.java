public class RowerElektryczny extends Pojazd implements Elektryczny{
    int poziomBaterii;

    @Override
    public int poziomNaładowania() {
        return poziomBaterii;
    }

    @Override
    public void naladuj() {

    }

    public RowerElektryczny(int id, String model, int poziomBaterii) {
        super(id, model);
        this.poziomBaterii = poziomBaterii;
    }

    @Override
    public double obliczKoszt() {
        return super.obliczKoszt();
    }

    @Override
    public String toString() {
        return "RowerElektryczny{" +
                "poziomBaterii=" + poziomBaterii +
                ", id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", czyDostępny=" + czyDostępny +
                '}';
    }
}
