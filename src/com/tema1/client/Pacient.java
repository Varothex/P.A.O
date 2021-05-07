package com.tema1.client;

public abstract class Pacient
{
    protected String nume, afectiune;
    protected int varsta;
    protected String[] alergie;
    private static int nr = 0;
    protected int idPacient;
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

    public int getIdPacient()
    {
        return idPacient;
    }

    public String getNume()
    {
        return nume;
    }

    public int getVarsta()
    {
        return varsta;
    }

    public String getAfectiune()
    {
        return afectiune;
    }

    public void getAlergie(String[] alergie)
    {
        for (String s : alergie)
            System.out.println(s + " ");
        System.out.println();
    }
}