package com.tema1.client;

public class Adult extends Pacient
{
    private String asigurare;
    private String loc_munca;

    public Adult(String nume, int varsta, String afectiune, String asigurare, String loc_munca)
    {
        super(nume, varsta, afectiune);
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
}
