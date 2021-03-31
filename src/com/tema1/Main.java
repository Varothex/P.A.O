package com.tema1;

import java.util.Scanner;
import com.tema1.client.*;
import com.tema1.medic.*;
import com.tema1.programare.*;
import com.tema1.Serviciu;

public class Main
{
    public static void main(String[] args)
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

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        Serviciu interogations = new Serviciu();

        while (i > 0)
        {
            if (i == 1)
            {
                interogations.addMedic_Primar(in);
            }

            if (i == 2)
            {
                interogations.addMedic_Chirurg(in);
            }


            if (i == 3)
            {
                interogations.addPacient_Adult(in);
            }

            if (i == 4)
            {
                interogations.addPacient_Copil(in);
            }

            if (i == 5)
            {
                interogations.addProgramare_Medic_Primar(in);
            }

            if (i == 6)
            {
                interogations.addProgramare_Medic_Chirurg(in);
            }

            if (i == 7)
            {
                System.out.println("Scrieti id-ul medicului:");
                Medic medic = Serviciu.findMedic(in.nextInt());
                if (medic != null)
                    System.out.println(medic.getNume() + " " + medic.getCabinet() + " " + medic.getIdMedic() + " " + medic.getSalariu() + "\n");
                else
                    System.out.println("Medicul nu exista!");
            }

            if (i == 8)
            {
                System.out.println("Scrieti id-ul pacientului:");
                Pacient client = Serviciu.findClient(in.nextInt());
                if (client != null)
                    System.out.println(client.getNume() + "\n");
                else
                    System.out.println("Pacientul nu exista!");
            }

            if (i == 9)
            {
                interogations.afisMedic();
            }

            if (i == 10)
            {
                interogations.afisPacient();
            }

            if (i == 11)
            {
                interogations.afisProgram();
            }

            if (i == 12)
            {
                break;
            }

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

            i = in.nextInt();

        }
    }
}

