/*
Autor: Eric Walter
Programmierung 3, AB01, Tapken, Sommersemester 2020
*/
package de.hsos.prog3.ab1.orchester;

import com.company.Main;

import java.net.URL;
import java.util.HashSet;

public class Orchester{
    private String bezeichnung;
    private String audioDateiKonzert;
    private DirigentIn dirigentIn;
    private HashSet<MusikerIn> musikerInnen = new HashSet<>();
    private Verhalten verhalten;

    public Orchester(String bezeichnung, String audioDateiKonzert){
        this.bezeichnung = bezeichnung;
        this.audioDateiKonzert = audioDateiKonzert;
    }

    public void addDirigentIn(DirigentIn dirigentIn){
        this.dirigentIn = dirigentIn;
    }

    public void addMusikerIn(MusikerIn musikerIn){
        musikerInnen.add(musikerIn);
    }

    public HashSet<MusikerIn> getMusikerInnen(){
        return musikerInnen;
    }

    public URL getAudioDateiKonzert(){
        return App.class.getResource(audioDateiKonzert);
    }

    public void proben(){
        verhalten = new Probe();
    }

    public void auftreten(){
        verhalten = new Konzert();
    }

    public void spielen(){
        verhalten.spielen(this);
    }
}
