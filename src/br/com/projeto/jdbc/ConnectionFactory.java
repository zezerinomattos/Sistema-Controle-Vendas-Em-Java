package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
// METODO CONNECTION QUE VAI RETORNAR O OBJETO DO TIPO CONNECTION
    public Connection getConnection(){
        
        try {
            
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdvendas","zezerino","Dudajosi2");
//          return DriverManager.getConnection("jdbc:mysql://18.231.11.54:80/mydbjava","root","pass123");
            
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        
    }
    
    
}
