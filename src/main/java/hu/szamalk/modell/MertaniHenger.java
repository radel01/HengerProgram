package hu.szamalk.modell;

public class MertaniHenger {
    private static int hengerDarab=0;
    private double sugar;
    private double magassag;

    public MertaniHenger(double sugar, double magassag) {
        MertaniHenger.hengerDarab++;
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
        return (sugar*sugar)*magassag*Math.PI;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }
    //Veszélyes!!!
    public static void setHengerDarab(int hengerDarab) {
        MertaniHenger.hengerDarab = hengerDarab;
    }

    @Override
    public String toString() {
        return "MertaniHenger{" +
                "sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }




}
