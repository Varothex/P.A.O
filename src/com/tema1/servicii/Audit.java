package com.tema1.servicii;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class Audit
{
    private static Audit instance = null;
    public BufferedWriter writer;

    private Audit()
    {
        try
        {
            writer = new BufferedWriter(new FileWriter("audit.csv", true));
        }
        catch (IOException exception)
        {
            System.out.println("Exception: " + exception.getMessage());
        }
    }

    public static Audit getInstance()
    {
        if(instance == null)
        {
            instance = new Audit();
        }
        return instance;
    }

    public void writeAction(String actionMessage)
    {
        Timestamp date = new Timestamp(System.currentTimeMillis());

        try
        {
            writer.write(actionMessage + date + "\n");
        }
        catch (IOException exception)
        {
            System.out.println("Exception: " + exception.getMessage());
        }
    }

    public void close()
    {
        try
        {
            writer.close();
        }
        catch (IOException exception)
        {
            System.out.println("Exception: " + exception.getMessage());
        }
    }
}
