package com.tema1;

import java.util.Scanner;

import com.tema1.medic.*;
import com.tema1.servicii.*;
import com.tema1.CSV.*;
import com.tema1.database.repository.Medici;

public class Main
{
    public static void main(String[] args)
    {
//        Write out = Write.getInstance();
//        out.writeMedicPrimarCSV(new MedicPrimar("Ana", "Sv", 200));

//        Medici daoMedici2 = Medici.getInstance();
//        MedicPrimar medik = new MedicPrimar("Ana", "Sv", 200);
//        daoMedici2.writePrimari(medik);

        displayCommands();

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        Read inp1 = Read.getInstance();
        Read inp2 = Read.getInstance();
        Medici daoMedici = Medici.getInstance();

        inp1.MedicPrimarCSV();
        inp2.MedicChirurgCSV();
        daoMedici.readPrimari();

        ServiciiMedic med = ServiciiMedic.getInstance();
        while (i != 12)
        {
            switch(i)
            {
                case 1:
                    med.addMedicPrimar(in);
                    break;
                case 2:
                    med.addMedicChirurg(in);
                    break;
                case 3:
                    ServiciiPacient.addPacientAdult(in);
                    break;
                case 4:
                    ServiciiPacient.addPacientCopil(in);
                    break;
                case 5:
                    ServiciiProgramare.addProgramareMedicPrimar(in);
                    break;
                case 6:
                    ServiciiProgramare.addProgramareMedicChirurg(in);
                    break;
                case 7:
                    System.out.println("Scrieti id-ul medicului:");
                    ServiciiMedic.findMedic(in.nextInt());
                    break;
                case 8:
                    System.out.println("Scrieti id-ul pacientului:");
                    ServiciiPacient.findClient(in.nextInt());
                    break;
                case 9:
                    ServiciiMedic.afisMedic();
//                    inp1.MedicPrimarCSV();
//                    inp2.MedicChirurgCSV();
//                    daoMedici.readPrimari();
//                    daoMedici.readChirurgi();
                    break;
                case 10:
                    ServiciiPacient.afisPacient();
                    //        daoClienti.read();
                    break;
                case 11:
                    ServiciiProgramare.afisProgram();
                    //        daoProgramare.read();
                    break;
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

