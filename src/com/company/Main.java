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
    }
}
