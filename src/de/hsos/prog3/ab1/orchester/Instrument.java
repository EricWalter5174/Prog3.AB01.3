package de.hsos.prog3.ab1.orchester;

public enum Instrument {
    SAXOPHON("res/Baritone.wav"),
    SCHLAGZEUG("res/Drum.wav"),
    AKKORDION("res/Accordion.wav");

    private String audiodatei;

    Instrument(String audiodatei){
        this.audiodatei = audiodatei;
    }

    public String getAudiodatei(){
        return this.audiodatei;
    }

}
