package com.tema1.database.repository;

import com.tema1.medic.*;
import com.tema1.client.*;
import com.tema1.programare.*;
import java.sql.*;

public class Programari
{
    private static Connection dbConnection;
    private static Programari daoProgramare;

    private Programari()
    {
        try
        {
            if (dbConnection == null || dbConnection.isClosed())
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pao_lab12", "root", "");
                createTableProgramarePrimar();
                createTableProgramareChirurg();
            }
        }
        catch (SQLException | ClassNotFoundException throwables)
        {
            throwables.printStackTrace();
        }
    }

    private void createTableProgramarePrimar()
    {
        final String query = "CREATE TABLE IF NOT EXISTS ProgramariPrimar (\n" +
                "Id INT PRIMARY KEY , \n" +
                "Data VARCHAR(10) NOT NULL, \n" +
                "Locatie VARCHAR(150) NOT NULL, \n" +
                "Pacient VARCHAR(50) NOT NULL,\n" +
                "Medic VARCHAR(50) NOT NULL,\n" +
                "Consultatie INT NOT NULL)";
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

    private void createTableProgramareChirurg()
    {
        final String query = "CREATE TABLE IF NOT EXISTS ProgramariChirurg (\n" +
                "id INT PRIMARY KEY , \n" +
                "Data VARCHAR(10) NOT NULL, \n" +
                "Locatie VARCHAR(150) NOT NULL, \n" +
                "Pacient VARCHAR(50) NOT NULL,\n" +
                "Medic VARCHAR(50) NOT NULL,\n" +
                "ZonaOperatie VARCHAR(50) NOT NULL)";
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

    public static Programari getDaoProgramare()
    {
        if(daoProgramare == null)
            daoProgramare = new Programari();
        return daoProgramare;
    }

    private ProgramareMedicPrimar mapToProgramare1(ResultSet resultSet) throws SQLException // id missing
    {
        ProgramareMedicPrimar ProgramarePrimar = new ProgramareMedicPrimar(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getInt(6));
        return ProgramarePrimar;
    }

    private ProgramareMedicChirurg mapToProgramare2(ResultSet resultSet) throws SQLException // id missing
    {
        ProgramareMedicChirurg ProgramareChirurg = new ProgramareMedicChirurg(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6));
        return ProgramareChirurg;
    }

//    public void read(){
//        List<Programare> Programare  = new ArrayList<>();
//        final String query = "SELECT * FROM Programari";
//        try{
//            Statement statement = dbConnection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//
//            while (resultSet.next()) {
//                Programare.add(mapToProgramare(resultSet));
//            }
//        } catch (SQLException exception) {
//            throw new RuntimeException("Something went wrong: ");
//        }
//    }
//
//    public void write(Programare Programare) {
//
//        final String query = "INSERT into Programari(Id, data, loc, Client, Medic) VALUES(?,?,?,?,?)";
//        try {
//
//
//            PreparedStatement preparedStatement = dbConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
//            preparedStatement.setInt(1, Programare.getId());
//            preparedStatement.setString(2, Programare.getdata());
//            preparedStatement.setString(3, Programare.getLoc());
//            preparedStatement.setString(4, Programare.getClient());
//            preparedStatement.setString(5, Programare.getMedic());
//            preparedStatement.execute();
//
//        }catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
//    public void delete(Programare Programare){
//        final String query= "DELETE FROM Programari WHERE ID=(?)";
//        try {
//
//
//            PreparedStatement preparedStatement = dbConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
//            preparedStatement.setInt(1, Programare.getId());
//            preparedStatement.execute();
//
//        }catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
}
