package com.tema1.servicii;

import com.tema1.medic.*;
import com.tema1.CSV.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciiMedic
{
    static ArrayList<Medic> medici = new ArrayList<>();
    private static ServiciiMedic instance = null;

    public static ServiciiMedic getInstance()
    {
        if(instance == null)
        {
            instance = new ServiciiMedic();
        }
        return instance;
    }

    public void addMedicPrimar(Scanner cin)
    {
        Write med = Write.getInstance();

        System.out.println("Nume:");
        String nume = cin.next();

        System.out.println("Cabinetul:");
        String cabinet = cin.next();

        System.out.println("Salariu:");
        int salariu = cin.nextInt();

        Medic medic = new MedicPrimar(nume, cabinet, salariu);
        medici.add(medic);

        med.writeMedicPrimarCSV(medic);

        Audit a = Audit.getInstance();
        a.writeAction("Add Medic Primar de la tastatura: ");
    }

    public void addMedicPrimarCSV(MedicPrimar med)
    {
        boolean already = false;
        for (Medic a : medici)
            if (a.equals(med))
            {
                already = true;
                break;
            }
        if (!already)
        {
            medici.add(med);
        }

        Audit a = Audit.getInstance();
        a.writeAction("Add Medic Primar din CSV: ");
    }

    public void addMedicChirurg(Scanner cin)
    {
        Write med = Write.getInstance();

        System.out.println("Nume:");
        String nume = cin.next();

        System.out.println("Cabinetul:");
        String cabinet = cin.next();

        System.out.println("Salariu:");
        int salariu = cin.nextInt();

        Medic medic = new MedicChirurg(nume, cabinet, salariu);
        medici.add(medic);

        med.writeMedicChirurgCSV(medic);

        Audit a = Audit.getInstance();
        a.writeAction("Add Medic Chirurg de la tastatura: ");
    }

    public void addMedicChirurgCSV(MedicPrimar med)
    {
        boolean already = false;
        for (Medic a : medici)
            if (a.equals(med))
            {
                already = true;
                break;
            }
        if (!already)
        {
            medici.add(med);
        }

        Audit a = Audit.getInstance();
        a.writeAction("Add Medic Chirurg din CSV: ");
    }

    public static void findMedic(int MedicId)
    {
        for (Medic medic: medici)
        {
            if (medic.getIdMedic() == MedicId)
                System.out.println(medic.getNume() + " " + medic.getCabinet() + " " + medic.getIdMedic() + " " + medic.getSalariu() + "\n");
        }
        System.out.println("Medicul nu exista!");
    }

    public static void afisMedic()
    {
        for(Medic medic: medici)
            System.out.println(medic.getIdMedic() + " " + medic.getNume() + " " + medic.getCabinet() + " " + medic.getSalariu() + "\n");
    }
}
