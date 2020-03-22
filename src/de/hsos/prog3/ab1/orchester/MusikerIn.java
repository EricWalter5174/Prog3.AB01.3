/*
Autor: Eric Walter
Programmierung 3, AB01, Tapken, Sommersemester 2020
*/
package de.hsos.prog3.ab1.orchester;

public class MusikerIn extends Mitglied {
    private String name;
    private Instrument instrument;

    public MusikerIn(String name, Instrument instrument){
        this.name = name;
        this.instrument = instrument;
    }

    @Override
    public String getName() {
        return name;
    }
    public Instrument getInstrument(){
        return instrument;
    }
}