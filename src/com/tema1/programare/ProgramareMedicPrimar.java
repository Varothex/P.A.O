package com.tema1.programare;

import com.tema1.client.Pacient;
import com.tema1.medic.Medic;

public class ProgramareMedicPrimar extends Programare
{
    private int[] pret = {100, 200, 300};
    int consultatie;

    public ProgramareMedicPrimar(String data, String locatie, String pacient, String medic, int consultatie)
    {
        super(data, locatie, pacient, medic);
        this.consultatie = consultatie;
    }

    public int[] getPret()
    {
        return pret;
    }

    public void setPret(int[] pret)
    {
        this.pret = pret;
    }

    public int getConsultatie()
    {
        return consultatie;
    }

    public void setConsultatie(int consultatie)
    {
        this.consultatie = consultatie;
    }

    public int cost()
    {
        return pret[consultatie];
    }

    @Override
    public String toString()
    {
        return "Pacientului " + pacient + " are consultatie la medicul " + medic + " pe data de " + data + " la " + locatie + " si costa " + cost() + ".\n\n";
    }
}
