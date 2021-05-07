package com.tema1.CSV;

import com.tema1.medic.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write
{
    private static Write instance = null;

    public static Write getInstance()
    {
        if (instance == null)
            instance = new Write();
        return instance;
    }

    public void writeMedicPrimarCSV(MedicPrimar med)
    {
        try (var out = new BufferedWriter(new FileWriter("/C:/Users/mihai/Tema PAO/mediciprimari.csv",true)))
        {
            out.write(med.getIdMedic() + ", " + med.getNume() + ", " + med.getCabinet() + ", " + med.getSalariu() + '\n');
        }
        catch (IOException e)
        {
            System.out.println("Writing Exception: "+ e.getMessage());
        }
    }
}