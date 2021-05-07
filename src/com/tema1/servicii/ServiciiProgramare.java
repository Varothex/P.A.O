package com.tema1.servicii;

import com.tema1.programare.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciiProgramare
{
   static ArrayList<Programare> programari = new ArrayList<>();

   public static void addProgramareMedicPrimar(Scanner cin)
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
        a.writeAction("Add Programare Medic Primar de la tastatura");
    }

    public static void addProgramareMedicChirurg(Scanner cin)
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

    public static void afisProgram()
    {
        for(Programare progr: programari)
        {
            System.out.println(progr.getData() + " " + progr.getLocatie() + " " + progr.getPacient() + " " + progr.getMedic() + "\n");
        }
    }
}
