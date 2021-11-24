package School_Management_System.Model;

import java.sql.*;

public class StudentDB {

 //public static void main(String args[])
 public static Connection getConnection() {
   // Connection getConnection()
   try {

     Class.forName("com.mysql.jdbc.Driver");
     // com.mysql.cj.jdbc.driver
     // com.mysql.jdbc.Driver
     Connection con = DriverManager.getConnection(
         "jdbc:mysql://localhost:3306/school_db?characterEncoding=latin1&useConfigs=maxPerformance",
         "root", "");

     Statement stmt = con.createStatement();

     ResultSet rs = stmt.executeQuery("select * from info");

     while (rs.next())

       System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " +
                          rs.getInt(3) + rs.getString(4));

     return con;

   } catch (Exception e) {
     System.out.println(e);
   }
  return null;
   
 }
}