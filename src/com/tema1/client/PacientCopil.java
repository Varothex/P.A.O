package com.tema1.client;

public class PacientCopil extends Pacient
{
    private String frica;
    private String scoala;

    public PacientCopil(String nume, int varsta, String afectiune, String frica, String scoala, String[] alergie)
    {
        super(nume, varsta, afectiune, alergie);
        this.frica = frica;
        this.scoala = scoala;
    }

    public String getFrica()
    {
        return frica;
    }

    public void setFrica(String frica)
    {
        this.frica = frica;
    }

    public String getScoala()
    {
        return scoala;
    }

    public void setScoala(String scoala)
    {
        this.scoala = scoala;
    }
}
