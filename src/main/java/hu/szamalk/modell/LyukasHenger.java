package hu.szamalk.modell;

public class LyukasHenger extends TomorHenger{
    private  double falvastagsag;

    public LyukasHenger(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag, 1, falvastagsag);
    }

    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public double terfogat() {
        //double kulsoV = super.terfogat();
        double belsoR=getSugar()-falvastagsag;
        MertaniHenger belsoH= new MertaniHenger(belsoR, this.getMagassag());
        MertaniHenger.csokkentHengerDarab();
        //double belsoV= belsoH.terfogat();
        return  super.terfogat()-belsoH.terfogat();

    }

    @Override
    public String toString() {
        String os = super.toString() ;
        return "<|--LyukasHenger{" +
                "falvastagsag=" + falvastagsag +
                '}'+"--|> "+os;
    }
}
