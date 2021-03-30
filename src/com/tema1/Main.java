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

