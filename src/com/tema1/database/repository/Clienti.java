package com.tema1.database.repository;

import com.tema1.medic.*;
import com.tema1.client.*;
import com.tema1.programare.*;
import java.sql.*;

public class Clienti
{
    private static Connection dbConnection;
    private static Clienti daoClienti;

    private Clienti()
    {
        try
        {
            if (dbConnection == null || dbConnection.isClosed())
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pao_lab12", "root", "");
                createTableAdulti();
                createTableCopii();
            }
        }
        catch (SQLException | ClassNotFoundException throwables)
        {
            throwables.printStackTrace();
        }
    }

    private void createTableAdulti()
    {
        final String query1 = "CREATE TABLE IF NOT EXISTS PacientiAdulti (\n" +
                "Id INT PRIMARY KEY, \n" +
                "Nume VARCHAR(50) NOT NULL, \n" +
                "Varsta INT NOT NULL, \n" +
                "Afectiune VARCHAR(100) NOT NULL), \n" +
                "Asigurare VARCHAR(100) NOT NULL), \n" +
                "Locmunca VARCHAR(100) NOT NULL), \n" +
                "Alergii VARCHAR(100) NOT NULL)"; // string[]
        try
        {
            Statement statement = dbConnection.createStatement();
            statement.execute(query1);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    private void createTableCopii()
    {
        final String query2 = "CREATE TABLE IF NOT EXISTS PacientiCopii (\n" +
                "id INT PRIMARY KEY, \n" +
                "Nume VARCHAR(50) NOT NULL, \n" +
                "Varsta INT NOT NULL, \n" +
                "Afectiune VARCHAR(100) NOT NULL), \n" +
                "Frica VARCHAR(100) NOT NULL), \n" +
                "Scoala VARCHAR(100) NOT NULL), \n" +
                "Alergii VARCHAR(100) NOT NULL)"; // string[]
        try
        {
            Statement statement = dbConnection.createStatement();
            statement.execute(query2);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static Clienti getDaoClienti()
    {
        if(daoClienti == null)
            daoClienti = new Clienti();
        return daoClienti;
    }

//    private PacientAdult mapToClienti1(ResultSet resultSet) throws SQLException // id missing
//    {
//        PacientAdult clientiAdulti = new PacientAdult(resultSet.getString(2), resultSet.getInt(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(6));
//        return clientiAdulti;
//    }
//
//    private PacientCopil mapToClienti2(ResultSet resultSet) throws SQLException // id missing
//    {
//        PacientCopil clientiCopii = new PacientCopil(resultSet.getString(2), resultSet.getInt(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(6));
//        return clientiCopii;
//    }

//    public void read()
//    {
//        List<Pacient> clienti  = new ArrayList<>();
//        final String query = "SELECT * FROM Clienti";
//        try
//        {
//            Statement statement = dbConnection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//
//            while (resultSet.next())
//            {
//                clienti.add(mapToClienti(resultSet));
//            }
//        }
//        catch (SQLException exception)
//        {
//            throw new RuntimeException("Something went wrong: ");
//        }
//    }
//
//    public void write(Pacient clienti)
//    {
//
//        final String query = "INSERT into Clienti(Id, Name, datan_nasterii, adresa) VALUES(?,?,?,?)";
//        try
//        {
//            PreparedStatement preparedStatement = dbConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
//            preparedStatement.setInt(1, clienti.getId());
//            preparedStatement.setString(2, clienti.getUserName());
//            preparedStatement.setString(3, clienti.getdatan());
//            preparedStatement.setString(4, clienti.getAdress());
//            preparedStatement.execute();
//
//        }
//        catch (SQLException throwables)
//        {
//            throwables.printStackTrace();
//        }
//    }
//
//    public void delete(Programare Programare)
//    {
//        final String query= "DELETE FROM Clienti WHERE ID=(?)";
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
