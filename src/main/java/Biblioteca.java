
import com.biblioteca.telas.TelaLogin;
import com.controle.acesso.model.Aluno;

import DAO.AlunoDAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author anacl
 */

public class Biblioteca {

    public static void main(String[] args) {
        // Cria uma nova instância da TelaLogin
        TelaLogin telaLogin = new TelaLogin();
        
        // Torna a tela visível
        telaLogin.setVisible(true);

        Aluno u = new Aluno();
        u.setNome("Ana Clara Dolavale da Cruz");
        u.setEmail("ana@ufrrj.com");
        u.setId(23242);
        u.setSenha(12345);

        new AlunoDAO().cadastrarAluno(u);
}
}
