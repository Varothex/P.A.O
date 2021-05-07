package com.tema1.servicii;

import com.tema1.medic.*;

import java.util.ArrayList;

public abstract class ServiciiMedic
{
    private static Iterable<? extends Medic> Medici;
    ArrayList<Medic> medici = new ArrayList<>();

    //Nu se recomanda metodele statice in serviciu -> se utilizeaza instanta serrviciului pentru apelul lor
    static void findMedic(int MedicId)
    {
        for (Medic medic: Medici)
        {
            if (medic.getIdMedic() == MedicId)
                System.out.println(medic.getNume() + " " + medic.getCabinet() + " " + medic.getIdMedic() + " " + medic.getSalariu() + "\n");
        }
        System.out.println("Medicul nu exista!");
    }

    void afisMedic()
    {
        for(Medic medic: medici)
            System.out.println(medic.getNume() + " " + medic.getCabinet() + " " + medic.getIdMedic() + " " + medic.getSalariu() + "\n");
    }
}
