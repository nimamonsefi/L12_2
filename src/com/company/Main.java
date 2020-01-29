package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager
                .getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                        "nimamonsefi","myjava123");
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO employee" +
                "(firstname,lastname,birthday) VALUES (?,?,?)");
        preparedStatement.setString(1,"Ali");
        preparedStatement.setString(2,"Rahimi");
        preparedStatement.setString(3,"1343/04/29");
        preparedStatement.executeUpdate();

        preparedStatement.setString(1,"Mamad");
        preparedStatement.setString(2,"Karimi");
        preparedStatement.setString(3,"1360/09/12");
        preparedStatement.executeUpdate();

        preparedStatement.setString(1,"Amir");
        preparedStatement.setString(2,"Farokhi");
        preparedStatement.setString(3,"1372/08/03");
        preparedStatement.executeUpdate();

        preparedStatement.setString(1,"Ali");
        preparedStatement.setString(2,"Lashkari");
        preparedStatement.setString(3,"1343/12/30");
        preparedStatement.executeUpdate();

        preparedStatement.setString(1,"Rahim");
        preparedStatement.setString(2,"Talebi");
        preparedStatement.setString(3,"1369/10/10");
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
