package hu.szamalk;

import hu.szamalk.modell.LyukasHenger;
import hu.szamalk.modell.MertaniHenger;
import hu.szamalk.modell.TomorHenger;

public class Main {
    public static void main(String[] args) {
        MertaniHenger m =new MertaniHenger(2,6);
        TomorHenger t=new TomorHenger(2,5,8);
        LyukasHenger ly=new LyukasHenger(1,1,1);
        System.out.println("m = "+ m);
        System.out.println("t = " + t);
        System.out.println("ly = " + ly);

    }

}