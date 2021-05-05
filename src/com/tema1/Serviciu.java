package com.tema1;

import com.tema1.client.*;
import com.tema1.medic.*;
import com.tema1.programare.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Serviciu
{
    private static Iterable<? extends Medic> Medici;
    private static Iterable<? extends Pacient> Clienti;
    ArrayList<Medic> medici = new ArrayList<>();
    ArrayList<Pacient> clienti = new ArrayList<>();
    ArrayList<Programare> programari = new ArrayList<>();

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
    }

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

    void addPacientAdult(Scanner cin)
    {
        System.out.println("Nume:");
        String nume = cin.next();

        System.out.println("Varsta:");
        int varsta = cin.nextInt();

        System.out.println("Afectiunea:");
        String afectiunea = cin.next();

        System.out.println("Asigurarea:");
        String asigurare = cin.next();

        System.out.println("Profesia:");
        String munca = cin.next();

        System.out.println("Nr de alergii si ce alergii are:");
        int nrALergii = cin.nextInt();
        String[] alergii = new String[nrALergii];
        for (int i = 0; i < nrALergii; i++)
            alergii[i] = cin.next();

        Pacient client = new PacientAdult(nume, varsta, afectiunea, asigurare, munca, alergii);
        clienti.add(client);
    }

    void addPacientCopil(Scanner cin)
    {
        System.out.println("Nume:");
        String nume = cin.next();

        System.out.println("Varsta:");
        int varsta = cin.nextInt();

        System.out.println("Afectiunea:");
        String afectiunea = cin.next();

        System.out.println("De ce ii este cel mai frica:");
        String frica = cin.next();

        System.out.println("Unde invata:");
        String scoala = cin.next();

        System.out.println("Nr de alergii si ce alergii are:");
        int nrALergii = cin.nextInt();
        String[] alergii = new String[nrALergii];
        for (int i = 0; i < nrALergii; i++)
            alergii[i] = cin.next();

        Pacient client = new PacientAdult(nume, varsta, afectiunea, frica, scoala, alergii);
        clienti.add(client);
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

    //Nu se recomanda metodele statice in serviciu-> se utilizeaza instanta serrviciului pentru apelul lor
    static void findMedic(int MedicId)
    {
        for (Medic medic: Medici)
        {
            if (medic.getIdMedic() == MedicId)
                System.out.println(medic.getNume() + " " + medic.getCabinet() + " " + medic.getIdMedic() + " " + medic.getSalariu() + "\n");
        }
        System.out.println("Medicul nu exista!");
    }

    //Nu se recomanda metodele statice in serviciu-> se utilizeaza instanta serrviciului pentru apelul lor
    static Pacient findClient(int ClientId)
    {
        for (Pacient client: Clienti)
        {
            if (client.getIdPacient() == ClientId)
                return client;
        }
        return null;
    }

    void afisMedic()
    {
        for(Medic medic: medici)
            System.out.println(medic.getNume() + " " + medic.getCabinet() + " " + medic.getIdMedic() + " " + medic.getSalariu() + "\n");
    }

    void afisPacient()
    {
        for(Pacient client: clienti)
            System.out.println(client.getNume() + " " + client.getVarsta() + " " + client.getAfectiune() + " " + "\n");
    }

    void afisProgram()
    {
        for(Programare progr: programari)
            System.out.println(progr.getData() + " " + progr.getLocatie() + " " + progr.getPacient() + " " + progr.getMedic() + "\n");
    }
}
