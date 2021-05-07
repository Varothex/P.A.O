package com.tema1.database.config;

import java.sql.*;

public class DatabaseConfiguration
{
    private static final String DB_URL = "jdbc:mysql://localhost:3306/pao_lab12";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connection databaseConnection;

    private DatabaseConfiguration()
    {
        try
        {
            if (databaseConnection == null || databaseConnection.isClosed())
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                databaseConnection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            }

        }
        catch (SQLException | ClassNotFoundException exception)
        {
            exception.printStackTrace();
        }
    }
    private void createdatabase()
    {
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            final String query = "CREATE DATABASE IF NOT EXISTS pao_lab 12";
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        }
        catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        finally
        {
            try
            {
                if (connection!= null)
                {
                    connection.close();
                }
            }
            catch (SQLException throwables)
            {
                throwables.printStackTrace();
            }
        }
    }
}

//public class DatabaseConfiguration
//{
//
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/pao_lab12";
//    private static final String USER = "root";
//    private static final String PASSWORD = "";
//
//    private static Connection databaseConnection;
//
//    private DatabaseConfiguration() {}
//
//    public static Connection getDatabaseConnection()
//    {
//        try
//        {
//            if (databaseConnection == null || databaseConnection.isClosed())
//            {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                databaseConnection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
//            }
//
//        }
//        catch (SQLException | ClassNotFoundException exception)
//        {
//            exception.printStackTrace();
//        }
//        return databaseConnection;
//    }
//}
