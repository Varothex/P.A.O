package com.tema1.programare;

import com.tema1.client.Pacient;
import com.tema1.medic.Medic;

public class Programare_Medic_Chirurg extends Programare
{
    private String zona_operatie;

    public Programare_Medic_Chirurg(String data, String locatie, String pacient, String zona_operatie, String medic)
    {
        super(data, locatie, pacient, medic);
        this.zona_operatie = zona_operatie;
    }

    public String getZona_operatie()
    {
        return zona_operatie;
    }

    public void setZona_operatie(String zona_operatie)
    {
        this.zona_operatie = zona_operatie;
    }

    @Override
    public String toString()
    {
        return "Operatia pacientului " + pacient + " in " + zona_operatie + " la medicul " + medic + " are loc pe data de " + data + " la " + locatie + ".\n\n";
    }
}
