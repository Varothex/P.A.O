package com.tema1.medic;

public class MedicPrimar extends Medic
{
    public MedicPrimar(String nume, String cabinet, int salariu)
    {
        super(nume, cabinet, salariu);
    }

    @Override
    public int getSalariu()
    {
        return salariu * 2;
    }
}
