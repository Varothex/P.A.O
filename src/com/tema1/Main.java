package com.tema1;

import com.tema1.medic.Medic;
import com.tema1.medic.Medic_Primar;

import com.tema1.client.Pacient;
import com.tema1.client.Adult;

public class Main
{
    public static void main(String[] args)
    {
        Medic mp = new Medic_Primar("Lola Anamaria", "Suceava Medical SA", 8000);
        Pacient da = new Adult("Marcel Lecram", 40, "gripa", "Nu are.", "muncitor", new String[]{"nuci", "migdale"});

        System.out.println(mp);
        System.out.println(da);
    }
}

//	clase simple cu atribute private / protected și metode de acces;
//	cel puțin 2 array-uri uni/bidimensionale;
//	utilizare moștenire pentru crearea de clase adiționale și utilizarea lor în cadrul colecțiilor;
//	cel puțin o clasă serviciu care sa expună operațiile sistemului;
//	o clasa Main din care sunt făcute apeluri către servicii.

//package project.actions;
//
//        import java.util.Scanner;
//
//public class Main {
//    public static void ShowMenu() {
//        System.out.println("1. Show a list of existing events");
//        System.out.println("2. Add an event");
//        System.out.println("3. Generate an event");
//        System.out.println("4. Show a list of existing locations");
//        System.out.println("5. Add a location");
//        System.out.println("6. Generate a location");
//        System.out.println("7. Show a list of clients, ordered alphabetically");
//        System.out.println("8. Add a client/Sign up");
//        System.out.println("9. Generate a client/Sign up");
//        System.out.println("10. Check the availability of an event");
//        System.out.println("11. Buy a ticket to an event");
//        System.out.println("12. Make a donation to a fundraiser");
//        System.out.println("13. Show how much money a fundraiser raised");
//        System.out.println("14. Check if a fundraiser reached their goal.");
//        System.out.println("0. Exit menu");
//    }
//
//    public static void main(String[] args) {
//        int opt = -1;
//        Scanner scanner = new Scanner(System.in);
//        while (opt != 0) {
//            ShowMenu();
//            opt = scanner.nextInt();
//            switch (opt) {
//                case 1:
//                    Service.listEvents();
//                    break;
//                case 2:
//                    Service.addEvent();
//                    break;
//                case 3:
//                    Service.generateEvent();
//                    break;
//                case 4:
//                    Service.listLocations();
//                    break;
//                case 5:
//                    Service.addLocation();
//                    break;
//                case 6:
//                    Service.generateLocation();
//                    break;
//                case 7:
//                    Service.listClients();
//                    break;
//                case 8:
//                    Service.addClient();
//                    break;
//                case 9:
//                    Service.generateClient();
//                    break;
//                case 10:
//                    Service.checkEventAvailability();
//                    break;
//                case 11:
//                    Service.buyTicket();
//                    break;
//                case 12:
//                    Service.makeDonation();
//                    break;
//                case 13:
//                    Service.showSum();
//                    break;
//                case 14:
//                    Service.checkReached();
//                    break;
//            }
//        }
//    }
//
//}

