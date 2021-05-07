package com.tema1.servicii;

import com.tema1.client.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciiPacient
{
    static ArrayList<Pacient> clienti = new ArrayList<>();

    public static void addPacientAdult(Scanner cin)
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

    public static void addPacientCopil(Scanner cin)
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

    public static void findClient(int ClientId)
    {
        for (Pacient client: clienti)
        {
            if (client.getIdPacient() == ClientId)
                System.out.println(client.getIdPacient() + " " + client.getNume() + " " + client.getVarsta() + " " + client.getAfectiune() + "\n");
        }
        System.out.println("CLientul nu exista!");
    }

    public static void afisPacient()
    {
        for(Pacient client: clienti)
            System.out.println(client.getIdPacient() + " " + client.getNume() + " " + client.getVarsta() + " " + client.getAfectiune() + " " + "\n");
    }
}
