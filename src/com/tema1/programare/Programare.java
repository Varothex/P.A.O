package com.tema1.programare;

public abstract class Programare
{
    protected String data, locatie, pacient, medic;

    public Programare(String data, String locatie, String pacient, String medic)
    {
        this.data = data;
        this.locatie = locatie;
        this.pacient = pacient;
        this.medic = medic;
    }

    public String getData()
    {
        return data;
    }

    public String getLocatie()
    {
        return locatie;
    }

    public String getPacient()
    {
        return pacient;
    }

    public String getMedic()
    {
        return medic;
    }
}
