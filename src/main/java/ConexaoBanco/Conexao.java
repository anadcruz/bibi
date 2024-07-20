/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author anacl
 */
public class Conexao {
    private static final String url ="jdbc:mysql://localhost:3306/bibliotecabd" ;
    private static final String user = "root";
    private static final String password = "10122004" ;

    private static Connection conn;

    public static Connection getConexao(){
    

    try{
        if(conn == null){ //verificação da conexao, se for negativo , ele cria uma , se já estiver criada, ele só retorna.

            conn = DriverManager.getConnection(url, user, password);
            return conn ;
        }else{
            return conn;
        }
    } catch (SQLException e){
        e.printStackTrace();
        return null;

    }
        }
    
    public static boolean validarUsuario(String cpf, String senha) {
        String sql = "SELECT * FROM aluno WHERE cpf = ? AND senha = ?";
        try (Connection conn = getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Retorna true se encontrar um usuário
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    }

    

