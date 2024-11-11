package hu.szamalk.modell;

public class TomorHenger  extends MertaniHenger{
    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly(){
        return fajsuly*this.terfogat();
    }
    @Override
    public String toString() {
        String os = super.toString() ;
        return "<|--TomorHenger{" +
                "fajsuly=" + fajsuly +
                '}'+ "--|> "+os;
    }
}
