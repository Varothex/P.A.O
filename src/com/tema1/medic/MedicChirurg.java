package com.tema1.medic;

public class MedicChirurg extends Medic
{
    public MedicChirurg(String nume, String cabinet, int salariu)
    {
        super(nume, cabinet, salariu);
    }

    @Override
    public int getSalariu()
    {
        return salariu * 6;
    }
}
