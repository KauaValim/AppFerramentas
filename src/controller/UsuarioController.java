/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Fornecedor;
import model.Produto;
import model.Usuario;
import model.UsuarioDAO;

/**
 *
 * @author KauaValim
 */
public class UsuarioController {
    private UsuarioDAO usuarioDAO;
    
    public UsuarioController() {
        usuarioDAO = new UsuarioDAO();
    }
    
    public boolean autenticar(String email, String senha) {
        if (usuarioDAO.autenticar(email, senha)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta");
            return false;
        }
    }
    
    public boolean adicionarUsuario(Usuario u) {
        if (usuarioDAO.adicionarUsuario(u)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Usuario não cadastrado");
            return false;
        }
    }
    
    public boolean alterarUsuario(Usuario u) {
        if (usuarioDAO.alterarUsuario(u)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Usuario não alterado");
            return false;
        }
    }
    
    public boolean excluirUsuario(int pkUsuario) {
        if (usuarioDAO.excluirUsuario(pkUsuario)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Usuario não excluído");
            return false;
        }
    }
    
    public boolean adicionarProduto(Produto p) {
        if (usuarioDAO.adicionarProduto(p)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Produto não cadastrado");
            return false;
        }
    }
    
    public boolean adicionarFornecedor(Fornecedor f) {
        if (usuarioDAO.adicionarFornecedor(f)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Fornecedor não cadastrado");
            return false;
        }
    }
    
    // TODO método readForDesc()

    public List<Usuario> readForDesc(int tipo, String desc) {
       return usuarioDAO.readForDesc(tipo, desc);
    }
    
    public Usuario readForPk(long pk) {
        Usuario usu = usuarioDAO.readForPk(pk);
        if(usu == null) {
            JOptionPane.showMessageDialog(null, "Usuario não encontrado");
            return null;
        }
        return usu;
    }
    
    public List<Fornecedor> readForForn(int tipo, String desc) {
       return usuarioDAO.readForForn(tipo, desc);
    }
    
    public List<Produto> readForProd(int tipo, String desc) {
       return usuarioDAO.readForProd(tipo, desc);
    }    
}
