package hu.szamalk;

import hu.szamalk.modell.LyukasHenger;
import hu.szamalk.modell.MertaniHenger;
import hu.szamalk.modell.TomorHenger;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    private List<MertaniHenger> hengerek;

    public static void main(String[] args) {
        new HengerProgram().run();
    }
    public void run(){
        int db=MertaniHenger.getHengerDarab();
        System.out.printf("A felhasznált hengerek (%d db): :\n", db);
        for(MertaniHenger henger:this.lista()){
            System.out.println(henger);
        }
        System.out.println("Átlagtérfogat: "+ this.atlagTerfogat());
        System.out.println("Csövek összes súlya: "+ this.csovekSulya());

    }

    public HengerProgram() {
        hengerek = new ArrayList<>();
        hengerek.add(new MertaniHenger(1,1));
        hengerek.add(new MertaniHenger(1,1));
        hengerek.add(new TomorHenger(1,1,.8));
        hengerek.add(new TomorHenger(1,1,.5));
        hengerek.add(new LyukasHenger(1,1,1));
        hengerek.add(new LyukasHenger(1,1,1));
    }
    public double atlagTerfogat(){
        double osszTerfogat=0;
        for(MertaniHenger henger:hengerek) {
            osszTerfogat += henger.terfogat();
        }
        return osszTerfogat/MertaniHenger.getHengerDarab();
    }
    public double csovekSulya(){
        double csovekOsszSulya=0;
        for(MertaniHenger henger:hengerek) {
            if(henger instanceof LyukasHenger) {
                /*2 sorban*/
                /*LyukasHenger h = (LyukasHenger)henger;
                csovekOsszSulya+=h.suly();*/
                /*1 sorban*/
                csovekOsszSulya += ((LyukasHenger) henger).suly();
            }
        }
        return csovekOsszSulya;
    }
    private List<MertaniHenger> lista(){
        return hengerek;
    }

}