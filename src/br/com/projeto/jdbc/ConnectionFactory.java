package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
// METODO CONNECTION QUE VAI RETORNAR O OBJETO DO TIPO CONNECTION
    public Connection getConnection(){
        
        try {
            
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdvendas","zezerino","123");
            
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        
    }
    
    
}
