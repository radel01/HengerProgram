package hu.szamalk;

import hu.szamalk.modell.LyukasHenger;
import hu.szamalk.modell.MertaniHenger;
import hu.szamalk.modell.TomorHenger;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    private List<MertaniHenger> hengerek;

    public static void main(String[] args) {
        MertaniHenger m =new MertaniHenger(2,6);
        TomorHenger t=new TomorHenger(2,5,8);
        LyukasHenger ly=new LyukasHenger(1,1,1);
        System.out.println("m = "+ m);
        System.out.println("t = " + t);
        System.out.println("ly = " + ly);

    }

    public HengerProgram() {
        hengerek = new ArrayList<>();
    }
    public double atlagTerfogat(){
        return 0.0;
    }
    public double csovekSulya(){
        return 0.0;
    }
    private List<MertaniHenger> lista(){
        return hengerek;
    }
    public void run(){

    }

}