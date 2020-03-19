package de.hsos.prog3.ab1.audio.adapter;
import de.hsos.prog3.ab1.audio.StdAudioPlayer;
import de.hsos.prog3.audio.SimpleAudioPlayer;
import java.net.URL;
import java.io.IOException;
//Anmerkung:
//Ich bin mir nicht sicher, ob ich die Aufgabe im Sinne des Erfinders gelöst habe.
//Die Funktionalität ist gegeben, allerdings besitzen die übergebenen URLs in den Methoden einmaligAbspielen und
//wiederholtAbspielen keinen Zweck, da die URL direkt beim erzeugen eines SimpleAudioPlayerAdapters übergeben wird.
//Wollte man die URLs mittels der Methoden übergeben, so müsste innerhalb der Methode ein neues SimpleAudioPlayer Objekt
//erzeugt werden. Folge wären nicht verwendbare tonAus und tonAn Methoden. mMn fehlt eine setURL-Methode im SimpleAudioPlayer.

public class SimpleAudioPlayerAdapter implements StdAudioPlayer{
    SimpleAudioPlayer player;

    public SimpleAudioPlayerAdapter(URL inputUrl) throws IOException{
        this.player = new SimpleAudioPlayer(inputUrl);
    }

    @Override
    public void einmaligAbspielen(URL url) throws IOException {
        player.play(0);
    }

    @Override
    public void wiederholtesAbspielen(URL url, int wiederholungen) throws IOException {
        player.play(wiederholungen);
    }

    @Override
    public void tonAus(){
        player.setDebug(true);
        player.verboseLogging(true);
    }

    @Override
    public void tonAn(){
        player.setDebug(false);
        player.verboseLogging(true);
    }
}