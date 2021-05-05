package com.tema1.client;

import java.util.Arrays;

public class PacientAdult extends Pacient
{
    private String asigurare;
    private String locmunca;

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

    public void setAsiguare(String asigurare)
    {
        this.asigurare = asigurare;
    }

    public String getLocmunca()
    {
        return locmunca;
    }

    public void setLocmunca(String loc_munca)
    {
        this.locmunca = locmunca;
    }

    @Override
    public String toString()
    {
        return "Pacientul " + nume + " care lucreaza ca " + locmunca + " sufera de " + afectiune + " si este alergic la " + Arrays.toString(alergie) + ".\n\n";
    }
}
