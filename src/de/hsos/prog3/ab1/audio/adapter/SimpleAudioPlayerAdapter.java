package de.hsos.prog3.ab1.audio.adapter;

import de.hsos.prog3.ab1.audio.StdAudioPlayer;
import de.hsos.prog3.audio.SimpleAudioPlayer;
import java.net.URL;
import java.io.IOException;


public class SimpleAudioPlayerAdapter implements StdAudioPlayer{

    SimpleAudioPlayer player;

    @Override
    public void einmaligAbspielen(URL url) throws IOException {
        this.player = new SimpleAudioPlayer(url);
        this.player.play(0);
    }

    @Override
    public void wiederholtesAbspielen(URL url, int wiederholungen) throws IOException {
        this.player = new SimpleAudioPlayer(url);
        this.player.play(wiederholungen);
    }

    @Override
    public void tonAus() {
        this.player.setDebug(true);
        this.player.verboseLogging(true);
    }

    @Override
    public void tonAn() {
        this.player.setDebug(false);
        this.player.verboseLogging(true);
    }
}