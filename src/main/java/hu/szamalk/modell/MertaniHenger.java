package hu.szamalk.modell;

public class MertaniHenger {
    private static int hengerDarab;
    private double sugar;
    private double magassag;

    public MertaniHenger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double terfogat(){
        return 0.0;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    @Override
    public String toString() {
        return "MertaniHenger{" +
                "sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }




}
