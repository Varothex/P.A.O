package com.tema1.client;

import java.util.Arrays;

public class Pacient_Adult extends Pacient
{
    private String asigurare;
    private String loc_munca;

    public Pacient_Adult(String nume, int varsta, String afectiune, String asigurare, String loc_munca, String[] alergie)
    {
        super(nume, varsta, afectiune, alergie);
        this.asigurare = asigurare;
        this.loc_munca = loc_munca;
    }

    public String getAsigurare()
    {
        return asigurare;
    }

    public void setAsiguare(String asigurare)
    {
        this.asigurare = asigurare;
    }

    public String getLoc_munca()
    {
        return loc_munca;
    }

    public void setLoc_munca(String loc_munca)
    {
        this.loc_munca = loc_munca;
    }

    @Override
    public String toString()
    {
        return "Pacientul " + nume + " care lucreaza ca " + loc_munca + " sufera de " + afectiune + " si este alergic la " + Arrays.toString(alergie) + ".\n\n";
    }
}
