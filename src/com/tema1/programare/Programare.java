package com.tema1.programare;

import com.tema1.client.Pacient;

public abstract class Programare
{
    protected String data;
    protected String locatie;
    //private Pacient pacient;

    //public Programare(String data, String locatie, Pacient pacient)
    public Programare(String data, String locatie)
    {
        this.data = data;
        this.locatie = locatie;
        //this.pacient = pacient;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public String getLocatie()
    {
        return locatie;
    }

    public void setLocatie(String locatie)
    {
        this.locatie = locatie;
    }

//    public Pacient getPacient()
//    {
//        return pacient;
//    }
//
//    public void setPacient(Pacient pacient)
//    {
//        this.pacient = pacient;
//    }
}
