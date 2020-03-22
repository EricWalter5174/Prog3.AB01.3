/*
Autor: Eric Walter
Programmierung 3, AB01, Tapken, Sommersemester 2020
*/
/*
package de.hsos.prog3.ab1.orchester;

import com.company.Main;
import de.hsos.prog3.ab1.audio.StdAudioPlayer;
import de.hsos.prog3.ab1.audio.adapter.SimpleAudioPlayerAdapter;

import java.io.IOException;

public class Probe implements Verhalten {
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
*/