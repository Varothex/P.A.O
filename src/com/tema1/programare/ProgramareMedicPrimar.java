package com.tema1.programare;

public class ProgramareMedicPrimar extends Programare
{
    private int[] pret = {100, 200, 300};
    int consultatie;

    public ProgramareMedicPrimar(String data, String locatie, String pacient, String medic, int consultatie)
    {
        super(data, locatie, pacient, medic);
        this.consultatie = consultatie;
    }

    public int getCost()
    {
        return pret[consultatie];
    }
}
