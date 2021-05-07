package com.tema1.medic;

import com.tema1.CSV.Read;

public abstract class Medic
{
    protected String nume, cabinet;
    public int salariu;
    private static int nr = 0;
    protected int idMedic;
    {
        this.idMedic = ++nr;
    }

    public Medic(String nume, String cabinet, int salariu)
    {
        this.nume = nume;
        this.cabinet = cabinet;
        this.salariu = salariu;
    }

    public int getIdMedic()
    {
        return idMedic;
    }

    public String getNume()
    {
        return nume;
    }

    public String getCabinet()
    {
        return cabinet;
    }

    abstract public int getSalariu();
}
