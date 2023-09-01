package com.marcin;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String connectionUrl = "jdbc:sqlserver://DESKTOP-K4JE02F\\SQLEXPRESS:1433;database=GARDEN;AuthenticationMethod=type2;integratedSecurity=true";

        //String query = "SELECT * from Klienci";
        String query = "SELECT z.IDZamówienia, k.Imię, k.Nazwisko, k.Miasto, k.Region from Klienci as k join Zamówienia as z on k.IDKlienta = z.IDKlienta";
        try{
            System.out.println("łączenie z severem baz danych....");
            try  (Connection connection = DriverManager.getConnection(connectionUrl))
                {
                    System.out.println("Połączono!");
                    Statement st = connection.createStatement();
                    ResultSet rs = st.executeQuery(query);

                    if(rs.next()){
                        System.out.println(rs.getString(1));
                        System.out.println(rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));

                        System.out.println("***************************************");
                        while (rs.next()){
                            System.out.println("ID: " + rs.getString(1));
                            System.out.println(rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
                        }
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

