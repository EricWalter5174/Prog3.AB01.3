package de.hsos.prog3.ab1.audio;
import java.net.URL;
import java.io.IOException;

public interface StdAudioPlayer{
    void einmaligAbspielen(URL url) throws IOException;
    void wiederholtesAbspielen(URL url, int wiederholungen) throws IOException;
    void tonAus();
    void tonAn();
}
