package com.tema1.CSV;

import com.tema1.medic.*;
import com.tema1.servicii.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read
{
    private static Read instance = null;

    public static Read getInstance()
    {
        if (instance == null)
        {
            instance = new Read();
        }
        return instance;
    }

    public void MedicPrimarCSV()
    {
        try(var csvReader = new BufferedReader(new FileReader("/C:/Users/mihai/Tema PAO/mediciprimari.csv")))
        {
            ServiciiMedic med = ServiciiMedic.getInstance();

            String row;
            while ((row = csvReader.readLine()) != null)
            {
                String []data = row.split(",");
                int d2 = Integer.parseInt(data[2]);

                med.addMedicPrimarCSV(new MedicPrimar(data[0], data[1], d2));
            }
        }
        catch (IOException e)
        {
            System.out.println("Reading Exception GP: " + e.getMessage());
        }
    }

    public void MedicChirurgCSV()
    {
        try(var csvReader = new BufferedReader(new FileReader("/C:/Users/mihai/Tema PAO/medicichirurgi.csv")))
        {
            ServiciiMedic med = ServiciiMedic.getInstance();

            String row;
            while ((row = csvReader.readLine()) != null)
            {
                String []data = row.split(",");
                int d2 = Integer.parseInt(data[2]);

                med.addMedicPrimarCSV(new MedicPrimar(data[0], data[1], d2));
            }
        }
        catch (IOException e)
        {
            System.out.println("Reading Exception GP: " + e.getMessage());
        }
    }
}