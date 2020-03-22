/*
Autor: Eric Walter
Programmierung 3, AB01, Tapken, Sommersemester 2020

Anmerkung zu 1.3:
Die Methode tonAn() sorgt nicht dafür, dass der Ton wieder angeschaltet wird, wohingegen tonAus() fehlerfrei funktioniert.
Der Grund weshalb das passiert, entzieht sich meiner Kenntnis.
*/
package com.company;
import de.hsos.prog3.ab1.audio.adapter.SimpleAudioPlayerAdapter;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException{
        URL url = Main.class.getResource("/Baritone.wav");
        SimpleAudioPlayerAdapter adapter = new SimpleAudioPlayerAdapter();
        adapter.einmaligAbspielen(url);
        adapter.tonAus();
        adapter.einmaligAbspielen(url);
        adapter.tonAn();
        adapter.wiederholtesAbspielen(url, 2);
    }
}
