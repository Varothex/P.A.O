package com.tema1;

import java.io.IOException;
import java.util.Scanner;

import com.tema1.CSV.*;
import com.tema1.client.*;
import com.tema1.medic.MedicPrimar;
import com.tema1.servicii.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        displayCommands();

        MedicPrimar java = new MedicPrimar("Java", "Cluj", 5);

        Read inp = Read.getInstance();
        inp.MedicPrimarCSV();

        Write out = Write.getInstance();
        out.writeMedicPrimarCSV(java);

        ServiciiMedicPrimar med = ServiciiMedicPrimar.getInstance();

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        Serviciu interogations = new Serviciu();

        while (i != 12)
        {
            switch(i)
            {
                case 1:
                    interogations.addMedicPrimar(in);
                case 2:
                    interogations.addMedicChirurg(in);
                case 3:
                    interogations.addPacientAdult(in);
                case 4:
                    interogations.addPacientCopil(in);
                case 5:
                    interogations.addProgramareMedicPrimar(in);
                case 6:
                    interogations.addProgramareMedicChirurg(in);
                case 7:
                    System.out.println("Scrieti id-ul medicului:");
                    Serviciu.findMedic(in.nextInt());
                case 8:
                    System.out.println("Scrieti id-ul pacientului:");
                    Pacient client = Serviciu.findClient(in.nextInt());
                    if (client != null)
                        System.out.println(client.getNume() + "\n");
                    else
                        System.out.println("Pacientul nu exista!");
                case 9:
                    interogations.afisMedic();
                case 10:
                    interogations.afisPacient();
                case 11:
                    interogations.afisProgram();
            }
            displayCommands();
            i = in.nextInt();
        }
    }

    private static void displayCommands()
    {
        System.out.println("1 pentru a adauga un medic primar");
        System.out.println("2 pentru a adauga un medic chirurg");
        System.out.println("3 pentru a adauga un pacient adult");
        System.out.println("4 pentru a adauga un pacient copil");
        System.out.println("5 pentru a adauga o programare pt medic primar");
        System.out.println("6 pentru a adauga o programare pt medic chirurg");
        System.out.println("7 pentru a cauta un medic");
        System.out.println("8 pentru a cauta un client");
        System.out.println("9 pentru a afisa medicii");
        System.out.println("10 pentru a afisa pacientii");
        System.out.println("11 pentru a afisa programarile");
        System.out.println("12 pentru a termina");
    }
}

