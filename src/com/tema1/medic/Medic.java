package com.tema1.medic;

public abstract class Medic
{
    public String getSalariu;
    protected String nume;
    protected String cabinet;
    protected int idMedic;
    static int nr = 0;
    protected double salariu;

    {
        this.idMedic = ++nr;
    }

    public Medic(String nume, String cabinet, double salariu)
    {
        this.nume = nume;
        this.cabinet = cabinet;
        this.salariu = salariu;
    }

    public abstract double salariu();

    public String getNume()
    {
        return nume;
    }

    public void setNume(String nume)
    {
        this.nume = nume;
    }

    public String getCabinet()
    {
        return cabinet;
    }

    public void setCabinet(String cabinet)
    {
        this.cabinet = cabinet;
    }

    public int getIdMedic()
    {
        return idMedic;
    }

    public double getSalariu()
    {
        return salariu;
    }

    public void setSalariu(double salariu)
    {
        this.salariu = salariu;
    }
}
