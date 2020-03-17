package com.company;
import de.hsos.prog3.ab1.audio.*;
import de.hsos.prog3.ab1.audio.adapter.SimpleAudioPlayerAdapter;
import de.hsos.prog3.audio.SimpleAudioPlayer;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException{
        URL url = Main.class.getResource("/Baritone.wav");
        SimpleAudioPlayerAdapter player = new SimpleAudioPlayerAdapter();
        player.einmaligAbspielen(url);
        player.tonAus();
        player.einmaligAbspielen(url);
    }
}
