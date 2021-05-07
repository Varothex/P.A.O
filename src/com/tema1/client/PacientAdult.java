package com.tema1.client;

public class PacientAdult extends Pacient
{
    private String asigurare, locmunca;

    public PacientAdult(String nume, int varsta, String afectiune, String asigurare, String locmunca, String[] alergie)
    {
        super(nume, varsta, afectiune, alergie);
        this.asigurare = asigurare;
        this.locmunca = locmunca;
    }

    public String getAsigurare()
    {
        return asigurare;
    }

    public String getLocmunca()
    {
        return locmunca;
    }
}
