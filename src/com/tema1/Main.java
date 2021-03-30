package com.tema1;

import com.tema1.medic.Medic;
import com.tema1.medic.Medic_Primar;

public class Main
{
    public static void main(String[] args)
    {
        Medic mp = new Medic_Primar("Anamaria Lola", "Suceava", 8000);

        System.out.println(mp);
    }
}

//	clase simple cu atribute private / protected și metode de acces;
//	cel puțin 2 array-uri uni/bidimensionale;
//	utilizare moștenire pentru crearea de clase adiționale și utilizarea lor în cadrul colecțiilor;
//	cel puțin o clasă serviciu care sa expună operațiile sistemului;
//	o clasa Main din care sunt făcute apeluri către servicii.

