package com.tema1.servicii;

import com.tema1.client.*;
import com.tema1.medic.*;
import com.tema1.programare.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiciiMedicPrimar extends ServiciiMedic
{
    private static Iterable<? extends Medic> Medici;
    private static Iterable<? extends Pacient> Clienti;
    ArrayList<Medic> medici = new ArrayList<>();
    ArrayList<Pacient> clienti = new ArrayList<>();
    ArrayList<Programare> programari = new ArrayList<>();

    private static ServiciiMedicPrimar instance = null;

    public static ServiciiMedicPrimar getInstance()
    {
        if(instance == null)
        {
            instance = new ServiciiMedicPrimar();
        }
        return instance;
    }

    public void addMedicPrimar(Scanner cin)
    {
        System.out.println("Nume:");
        String nume = cin.next();

        System.out.println("Cabinetul:");
        String cabinet = cin.next();

        System.out.println("Salariu:");
        double salariu = cin.nextDouble();

        Medic medic = new MedicPrimar(nume, cabinet, salariu);
        medici.add(medic);

        Audit a = Audit.getInstance();
        a.writeAction("addMedicPrimar");
    }

    public void addMedicPrimarCSV(Medic med)
    {
        Audit a = Audit.getInstance();
        a.writeAction("addMedicPrimarCSV");
    }

    void addProgramareMedicPrimar(Scanner cin)
    {
        System.out.println("Data:");
        String data = cin.next();

        System.out.println("Locatie:");
        String locatie = cin.next();

        System.out.println("Numele pacientului:");
        String client = cin.next();

        System.out.println("Numele medicului:");
        String medic = cin.next();

        System.out.println("Consultatie de tip 1, 2 sau 3:");
        int consultatie = cin.nextInt();

        Programare programare = new ProgramareMedicPrimar(data, locatie, client, medic, consultatie);
        programari.add(programare);

        Audit a = Audit.getInstance();
        a.writeAction("addProgramareMedicPrimar");
    }
}
