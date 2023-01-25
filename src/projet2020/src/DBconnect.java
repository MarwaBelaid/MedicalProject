/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet2020;

//import java.sql.DriverManager;
import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author Zohra
 */
public class DBconnect {
            final String DRIVER ="com.mysql.jdbc.Driver";
            final String DB_PATH ="jdbc:mysql://localhost:3306/orthopro";
            
            String username=null;
            String password=null;
            Connection conn=null;
            Statement stat=null;
            
            //our construcor will accept username and password from mysql
            public  DBconnect( String name,  String pass ){
                username=name;
                password = pass;
            }
            
            // let's define  connection method
            public void connect()throws SQLException, Exception{
                Class.forName(DRIVER);
                System.out.println("connecting ...");
                conn= DriverManager.getConnection(DB_PATH,username, password);
                stat =conn.createStatement();
            }
            public void closeConnection() throws SQLException, Exception {
                stat.close();
                conn.close();
            }
            public Statement getStatement(){
                return stat;
            }
            public Connection getConnection(){
                return conn;
            }
     
//    public static java.sql.Connection connecterDB() {
////        try {
////            Class.forName("com.mysql.jdbc.Driver");
////            System.out.println("Driver Done !!");
////            String url = "jdbc:mysql://localhost:3306/orthopro";
////            String user = "root";
////            String password = "";
////            java.sql.DBconnect cnx = DriverManager.getConnection(url, user, password);
////            System.out.println("Data Base connected !!");
////
////            return cnx;
////        } catch (Exception e) {
////            System.out.println("Data Base not found !!");
////            e.printStackTrace();
////            return null;
////        }
//return null;
//    }
    
    public static void main(String[] args) {
//        java.sql.DBconnect cnx=connecterDB();
//        Statement statement;
//        ResultSet res;
//         try {
//             statement= cnx.createStatement();
//             res=statement.executeQuery("SELECT nomMed FROM consultation;");
//             System.out.println(res);
//         } catch (SQLException ex) {
//             Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
//         }    
    }
}
