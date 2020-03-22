/*
Autor: Eric Walter
Programmierung 3, AB01, Tapken, Sommersemester 2020
*/
package de.hsos.prog3.ab1.orchester;

public class App {
    public static void main(String[] args){
        String audioDatei = "/All_Together.wav";
        Orchester orchester = new Orchester("HSOS Titty Twister Orchestra", audioDatei);

        DirigentIn karjan = new DirigentIn("Karjan");
        orchester.addDirigentIn(karjan);

        MusikerIn saxophon = new MusikerIn("Dirk Die Lunge Mueller", Instrument.SAXOPHON);
        MusikerIn akkordion = new MusikerIn("Akki Taste", Instrument.AKKORDION);
        MusikerIn drum = new MusikerIn("Das Biest", Instrument.SCHLAGZEUG);
        orchester.addMusikerIn(saxophon);
        orchester.addMusikerIn(akkordion);
        orchester.addMusikerIn(drum);

        orchester.proben();
        orchester.auftreten();
        orchester.spielen();
    }
}
