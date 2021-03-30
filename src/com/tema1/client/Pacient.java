package com.tema1.client;

public abstract class Pacient
{
    protected String nume;
    protected int varsta;
    protected String afectiune;
    private int idPacient;
    private static int nr = 0;

    {
        this.idPacient = ++nr;
    }

    public Pacient(String nume, int varsta, String afectiune)
    {
        this.nume = nume;
        this.varsta = varsta;
        this.afectiune = afectiune;
    }

    public String getNume()
    {
        return nume;
    }

    public void setNume(String nume)
    {
        this.nume = nume;
    }

    public int getVarsta()
    {
        return varsta;
    }

    public void setVarsta(int varsta)
    {
        this.varsta = varsta;
    }

    public String getAfectiune()
    {
        return afectiune;
    }

    public void setAfectiune(String afectiune)
    {
        this.afectiune = afectiune;
    }

    public int getId()
    {
        return idPacient;
    }

    public void setId(int idPacient)
    {
        this.idPacient = idPacient;
    }
}