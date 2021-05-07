package com.tema1.database.repository;

import com.tema1.medic.*;
import com.tema1.client.*;
import com.tema1.programare.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Medici
{
    private static Connection dbConnection;
    private static Medici instance;

    private Medici()
    {
        try
        {
            if (dbConnection == null || dbConnection.isClosed())
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pao_lab12", "root", "");
                createTablePrimar();
                createTableChirurg();
            }
        }
        catch (SQLException | ClassNotFoundException throwables)
        {
            throwables.printStackTrace();
        }
    }

    private void createTablePrimar()
    {
        final String query = "CREATE TABLE IF NOT EXISTS MediciPrimari (\n" +
                "Id INT PRIMARY KEY , \n" +
                "Nume VARCHAR(50) NOT NULL, \n" +
                "Cabinet VARCHAR(100) NOT NULL, \n" +
                "Salariu INT NOT NULL)";
        try
        {
            Statement statement = dbConnection.createStatement();
            statement.execute(query);

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    private void createTableChirurg()
    {
        final String query = "CREATE TABLE IF NOT EXISTS MediciChirurgi (\n" +
                "Id INT PRIMARY KEY , \n" +
                "Nume VARCHAR(50) NOT NULL, \n" +
                "Cabinet VARCHAR(100) NOT NULL, \n" +
                "Salariu INT NOT NULL)";
        try
        {
            Statement statement = dbConnection.createStatement();
            statement.execute(query);

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static Medici getInstance()
    {
        if(instance == null)
            instance = new Medici();
        return instance;
    }

    private MedicPrimar mapToMedici1(ResultSet resultSet) throws SQLException
    {
        MedicPrimar mediciPrimari = new MedicPrimar(resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4));
        return mediciPrimari;
    }

    private MedicChirurg mapToMedici2(ResultSet resultSet) throws SQLException
    {
        MedicChirurg mediciChirurgi = new MedicChirurg(resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4));
        return mediciChirurgi;
    }

    public void writePrimari(Medic Medici)
    {
        final String query = "INSERT into mediciPrimari(Id, Nume, Cabinet, Salariu) VALUES(?,?,?,?)";
        try
        {
            PreparedStatement preparedStatement = dbConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
            preparedStatement.setInt(1, Medici.getIdMedic());
            preparedStatement.setString(2, Medici.getNume());
            preparedStatement.setString(3, Medici.getCabinet());
            preparedStatement.setDouble(4, Medici.getSalariu());
            preparedStatement.execute();
        }
        catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }

    public void readPrimari()
    {
        List<MedicPrimar> Medici  = new ArrayList<>();
        final String query = "SELECT * FROM mediciPrimari";
        try
        {
            Statement statement = dbConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
                Medici.add(mapToMedici1(resultSet));
            }
        }
        catch (SQLException exception)
        {
            throw new RuntimeException("Exception " + exception.getMessage());
        }

        for (MedicPrimar med: Medici)
        {
            System.out.println(med.getIdMedic() + " " + med.getNume() + " " + med.getCabinet() + " " + med.getSalariu() + "\n");
        }
    }

//    public void delete(Programare Programare)
//    {
//        final String query= "DELETE FROM Medici WHERE ID=(?)";
//        try
//        {
//            PreparedStatement preparedStatement = dbConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
//            preparedStatement.setInt(1, Programare.getId());
//            preparedStatement.execute();
//
//        }
//        catch (SQLException throwables)
//        {
//            throwables.printStackTrace();
//        }
//    }
}
