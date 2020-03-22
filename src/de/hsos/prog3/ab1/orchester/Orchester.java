/*
Autor: Eric Walter
Programmierung 3, AB01, Tapken, Sommersemester 2020

Anmerkung zu 1.5:
Es ist möglich innere Klassen zu verwenden, wenn die geschachtelte Klasse engen Bezug zur schachtelnden Klasse besitzt.
In diesem Fall wäre das gegeben. Dadurch wird sowohl die Anzahl der .java Klassen im Projekt-Explorer verringert,
als auch der Bezug der Klassen deutlich. Allerdings leidet die Übersichtlichkeit der schachtelnden Klasse. Außerdem wäre
es unpraktisch, wenn man zu einem späteren Zeitpunkt von einer anderen Klasse auf diese inneren Klassen zugreifen möchte,
da man diese dann genauso gut in einer separaten Klasse implementieren müsste.
*/
package de.hsos.prog3.ab1.orchester;

import com.company.Main;
import de.hsos.prog3.ab1.audio.StdAudioPlayer;
import de.hsos.prog3.ab1.audio.adapter.SimpleAudioPlayerAdapter;
import java.io.IOException;
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

    //1.5
    private class Probe implements Verhalten {
        @Override
        public void spielen(Orchester orchester) {
            if(orchester.getMusikerInnen() != null){
                for(MusikerIn m : orchester.getMusikerInnen()) {
                    StdAudioPlayer playerA = new SimpleAudioPlayerAdapter();
                    try {
                        playerA.einmaligAbspielen(Main.class.getResource(m.getInstrument().getAudiodatei()));
                    }
                    catch (IOException e){
                        e.printStackTrace();
                        System.out.println("Probe wird abgebrochen");
                    }
                }
            }
        }
    }

    private class Konzert implements Verhalten{

        @Override
        public void spielen(Orchester orchester) {
            StdAudioPlayer playerA = new SimpleAudioPlayerAdapter();
            try{
                playerA.einmaligAbspielen(orchester.getAudioDateiKonzert());
            }
            catch(IOException e){
                e.printStackTrace();
                System.out.println("Konzert wird abgebrochen");
            }
        }
    }
}
