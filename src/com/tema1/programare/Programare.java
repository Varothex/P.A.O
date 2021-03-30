package com.tema1.programare;

import com.tema1.client.Pacient;
import com.tema1.medic.Medic;

public abstract class Programare
{
    protected String data;
    protected String locatie;
    protected Pacient pacient;
    protected Medic medic;

    public Programare(String data, String locatie, Pacient pacient, Medic medic)
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

    public Pacient getPacient()
    {
        return pacient;
    }

    public void setPacient(Pacient pacient)
    {
        this.pacient = pacient;
    }

    public Medic getMedic()
    {
        return medic;
    }

    public void setMedic(Medic medic)
    {
        this.medic = medic;
    }
}
