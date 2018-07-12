package br.edu.ifpe.usuarios.dao;

import br.edu.ifpe.usuarios.entidade.Usuario;
import br.edu.ifpe.usuarios.util.Conexoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    public void salvar(Usuario usuario){
        try {
            Connection conexao = Conexoes.getConexao();
            PreparedStatement ps = conexao.prepareCall("");
            
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getMatricula());
            ps.execute();
            Conexoes.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
