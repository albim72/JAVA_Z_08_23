package marcin.com;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mojabaza_dlajavy";
        String user = "root";
        String password = "abc123";

        String query = "CREATE TABLE IF NOT EXISTS registration " +
        "(id INTEGER not NULL, " +
        "first VARCHAR(50),"+
        "last VARCHAR(50),"+
        "age INTEGER,"+
        "PRIMARY KEY(id));";

        String mSelect = "SELECT id,first,last,age FROM registration";


        try(Connection con = DriverManager.getConnection(url,user,password);
            Statement st = con.createStatement();){
//            st.executeUpdate(query);
//            System.out.println("Tabela została utworzona!");

//            String sql_r1 = "INSERT INTO registration VALUES(107,'Anna','Kot',45);";
//            st.executeUpdate(sql_r1);
//            System.out.println("dodano rekord do tabeli...");
//
//            String sql_r2 = "INSERT INTO registration VALUES(109,'Henryk','Kos',33);";
//            st.executeUpdate(sql_r2);
//            System.out.println("dodano rekord do tabeli...");
//
//            String sql_r3 = "INSERT INTO registration VALUES(111,'Nadia','Kowal',22);";
//            st.executeUpdate(sql_r3);
//            System.out.println("dodano rekord do tabeli...");

            ResultSet rs = st.executeQuery(mSelect + " ORDER BY first ASC;");

            while (rs.next()){
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", WIEK: " + rs.getInt("age"));
                System.out.print(", IMIĘ: " + rs.getString("first"));
                System.out.print(", NAZWISKO: " + rs.getString("last"));
                System.out.println("\n");
            }

            String usuwanie = "DELETE FROM registration WHERE id=?";
            //st.executeUpdate(usuwanie,107);
            PreparedStatement prepStt = con.prepareStatement(usuwanie);
            prepStt.setInt(1,107);
            prepStt.execute();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
