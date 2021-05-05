package com.tema1.programare;

import com.tema1.client.Pacient;
import com.tema1.medic.Medic;

public class ProgramareMedicChirurg extends Programare
{
    private String zonaoperatie;

    public ProgramareMedicChirurg(String data, String locatie, String pacient, String zonaoperatie, String medic)
    {
        super(data, locatie, pacient, medic);
        this.zonaoperatie = zonaoperatie;
    }

    public String getZonaoperatie()
    {
        return zonaoperatie;
    }

    public void setZonaoperatie(String zonaoperatie)
    {
        this.zonaoperatie = zonaoperatie;
    }

    @Override
    public String toString()
    {
        return "Operatia pacientului " + pacient + " in " + zonaoperatie + " la medicul " + medic + " are loc pe data de " + data + " la " + locatie + ".\n\n";
    }
}
