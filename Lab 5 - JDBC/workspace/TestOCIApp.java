import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestOCIApp {

  public static void main(String args[]) throws ClassNotFoundException,
      SQLException {
      Scanner in = new Scanner(System.in);
      System.out.println("1.read operation");
      System.out.println("2.create operation");
      System.out.println("3.update operation");
      System.out.println("4.delete operation");
    Class.forName("oracle.jdbc.driver.OracleDriver");
   
    Connection conn = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");

    Statement stmt = conn.createStatement();
    int option = in.nextInt();
    System.out.println("Enter the id:");
    int id = in.nextInt();
    switch(option){
      case 1 :
      System.out.println("SELECT Statement >>>>>>>>>");
     ResultSet rset = stmt.executeQuery("select * from shiva");
     while (rset.next()){
       System.out.println(rset.getString(1)+"-");
       System.out.print(rset.getString(2)+"-");
       System.out.print(rset.getString(3)+"-");
       System.out.print(rset.getString(4)+"-");
       System.out.print(rset.getString(5));
       
     }
     System.out.println("");
     rset.close();
     case 2 : System.out.println("INSERT Statement >>>>>>>>>");
              ResultSet rset1 = stmt.executeQuery("insert into shiva values("+id+",'puvi',56589,'13IT85',5,'USA VISA')");
              System.out.println(rset1.toString());
              rset1.close();
     case 3 : System.out.println("UPDATE Statement >>>>>>>>>");
              ResultSet rset2 = stmt.executeQuery("update shiva set semester=3 where id="+id);
              System.out.println(rset2.toString());
              rset2.close();
     case 4:  System.out.println("DELETE Statement >>>>>>>>>");
              ResultSet rset3 = stmt.executeQuery("delete from shiva where id="+id);
              System.out.println(rset3.toString());
              rset3.close();
   }
    
    stmt.close();
    conn.close();
  }
}