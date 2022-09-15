package sla.library.connection;

import java.sql.ResultSet;


public class ConectorBD {
    
    
    public static void execute(String comando){
        System.out.println("Executando o comando: " +comando);
    }
    
    public static ResultSet executeQuery(String comando){
        System.out.println("Executando a consulta: " +comando);
    return null;
    }
    
}
