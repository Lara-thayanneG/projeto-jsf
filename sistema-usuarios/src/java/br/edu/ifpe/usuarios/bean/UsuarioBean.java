  
package br.edu.ifpe.usuarios.bean;

import br.edu.ifpe.usuarios.dao.UsuarioDAO;
import br.edu.ifpe.usuarios.entidade.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UsuarioBean {
    private Usuario usuario;
    private List<Usuario> usuarios = new ArrayList<>();
    
    public void adicionar(){
        usuarios.add(usuario);
        new UsuarioDAO().salvar(usuario);
        usuario = new Usuario();
        
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
