/*
Autor: Eric Walter
Programmierung 3, AB01, Tapken, Sommersemester 2020
*/
package de.hsos.prog3.ab1.orchester;

public class DirigentIn extends Mitglied{
    private String name;

    public DirigentIn(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
