package com.tema1.programare;

import com.tema1.client.Pacient;
import com.tema1.medic.Medic;

public abstract class Programare
{
    protected String data;
    protected String locatie;
    protected String pacient;
    protected String medic;

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

    public String getPacient()
    {
        return pacient;
    }

    public void setPacient(String pacient)
    {
        this.pacient = pacient;
    }

    public String getMedic()
    {
        return medic;
    }

    public void setMedic(String medic)
    {
        this.medic = medic;
    }
}
