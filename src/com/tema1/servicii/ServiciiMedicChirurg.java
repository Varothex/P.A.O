package com.tema1.servicii;

import com.tema1.client.*;
import com.tema1.medic.*;
import com.tema1.programare.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiciiMedicChirurg extends ServiciiMedic
{
    private static Iterable<? extends Medic> Medici;
    private static Iterable<? extends Pacient> Clienti;
    ArrayList<Medic> medici = new ArrayList<>();
    ArrayList<Pacient> clienti = new ArrayList<>();
    ArrayList<Programare> programari = new ArrayList<>();

    void addMedicChirurg(Scanner cin)
    {
        System.out.println("Nume:");
        String nume = cin.next();

        System.out.println("Cabinetului:");
        String cabinet = cin.next();

        System.out.println("Salariu:");
        double salariu = cin.nextDouble();

        Medic medic = new MedicChirurg(nume, cabinet, salariu);
        medici.add(medic);
    }

    void addProgramareMedicChirurg(Scanner cin)
    {
        System.out.println("Data:");
        String data = cin.next();

        System.out.println("Locatie:");
        String locatie = cin.next();

        System.out.println("Numele pacientului:");
        String client = cin.next();

        System.out.println("Numele medicului:");
        String medic = cin.next();

        System.out.println("Zona de operat:");
        String zona = cin.next();

        Programare programare = new ProgramareMedicChirurg(data, locatie, client, medic, zona);
        programari.add(programare);
    }
}
