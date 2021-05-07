package com.tema1.programare;

public class ProgramareMedicChirurg extends Programare
{
    private String zonaOperatie;

    public ProgramareMedicChirurg(String data, String locatie, String pacient, String medic, String zonaOperatie)
    {
        super(data, locatie, pacient, medic);
        this.zonaOperatie = zonaOperatie;
    }
}
