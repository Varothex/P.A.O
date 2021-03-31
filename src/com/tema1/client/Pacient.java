package com.tema1.client;

public abstract class Pacient
{
    protected String nume;
    protected int varsta;
    protected String afectiune;
    protected String[] alergie;
    private int idPacient;
    private static int nr = 0;

    {
        this.idPacient = ++nr;
    }

    public Pacient(String nume, int varsta, String afectiune, String[] alergie)
    {
        this.nume = nume;
        this.varsta = varsta;
        this.afectiune = afectiune;
        this.alergie = alergie;
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

    public void getAlergie(String[] alergie)
    {
        for (String s : alergie)
            System.out.println(s + " ");
        System.out.println();
    }

    public void setAlergie(String[] alergie)
    {
        this.alergie = alergie;
    }

    public int getIdPacient()
    {
        return idPacient;
    }

    public void setId(int idPacient)
    {
        this.idPacient = idPacient;
    }
}