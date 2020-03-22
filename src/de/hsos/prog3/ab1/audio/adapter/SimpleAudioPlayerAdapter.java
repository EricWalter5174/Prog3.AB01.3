package de.hsos.prog3.ab1.audio.adapter;
import de.hsos.prog3.ab1.audio.StdAudioPlayer;
import de.hsos.prog3.audio.SimpleAudioPlayer;
import java.net.URL;
import java.io.IOException;

public class SimpleAudioPlayerAdapter implements StdAudioPlayer{
    private SimpleAudioPlayer player;

    @Override
    public void einmaligAbspielen(URL url) throws IOException {
        if(player == null) {
            player = new SimpleAudioPlayer(url);
        }
        player.play(0);

    }

    @Override
    public void wiederholtesAbspielen(URL url, int wiederholungen) throws IOException {
        for(int i = 1; i <= wiederholungen; i++) {
            einmaligAbspielen(url);
        }
    }

    @Override
    public void tonAus(){
        if(player != null){
            player.setDebug(true);
            player.verboseLogging(true);
            System.out.println("Ton wurde ausgeschaltet");
        }
    }

    @Override
    public void tonAn(){
        if(player != null) {
            player.setDebug(false);
            player.verboseLogging(true);
            System.out.println("Ton wurde angeschaltet");
        }
    }
}