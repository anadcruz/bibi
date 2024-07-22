package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.controle.acesso.model.Aluno;

import ConexaoBanco.Conexao;

public class AlunoDAO {

    public void cadastrarAluno(Aluno aluno){

        String sql = "INSERT INTO USUARIO (NOME, SENHA, EMAIL, ID) VALUES (?, ?, ?, ? )" ;

        PreparedStatement ps = null;

        try{
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setInt(2, aluno.getSenha());
            ps.setString(3, aluno.getEmail());
          
            ps.setInt(4, aluno.getId());
            
            ps.execute();
            ps.close();
            
        }catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

}
