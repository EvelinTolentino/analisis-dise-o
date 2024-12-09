package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author EVELIN
 */
public class Conexion {
    public static void main (String args[]){
        Connection   conexion;
        String jdbc = "jdbc:mysql://localhost:3306/ejemplo";
        
        try{
            conexion = DriverManager.getConnection(jdbc, "ejemplo", "ejemplo");
            System.out.println("");
        }catch (SQLException sql){
            //Tratar esta exception 
        }
    }

}

