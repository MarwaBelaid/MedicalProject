/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet2020;
import java.sql.*;
/**
 *
 * @author Zohra
 */
public class readDataBase { /// THIS CLASS IS JUST FOR TEST
    
        public static void main(String[] args){
            DBconnect db = new DBconnect("root",""); // our object
            String sql="SELECT * FROM presciption"; // our query
            
            try{
                db.connect();
                ResultSet rs =db.getStatement().executeQuery(sql);
                
                while(rs.next()){
                    String medecin = rs.getString("nomMed");
                    int id=rs.getInt("id_prescription");
                    System.out.println();
                    System.out.println("nom medecin :"+medecin) ;
                    System.out.println("identificateur :"+id) ;
                    System.out.println("---------------------------------------------");
                }
                rs.close();
                db.closeConnection();
            }catch(SQLException se){
                se.printStackTrace();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
}
