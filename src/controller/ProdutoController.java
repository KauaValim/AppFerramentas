/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;
import model.ProdutoDAO;
import model.Usuario;

/**
 *
 * @author S.Lucas
 */
public class ProdutoController {
    private ProdutoDAO produtoDAO;
    
    public ProdutoController() {
        produtoDAO = new ProdutoDAO();
    }
    
    public boolean adicionarProduto(Produto p) {
        if (produtoDAO.adicionarProduto(p)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Produto não cadastrado");
            return false;
        }
    }
    
    public boolean alterarProduto(Produto p) {
        if (produtoDAO.alterarProduto(p)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Produto não alterado");
            return false;
        }
    }
    
    public boolean excluirProduto(int pkProduto) {
        if (produtoDAO.excluirProduto(pkProduto)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Produto não excluído");
            return false;
        }
    }
    
    public List<Produto> readForProd(int tipo, String desc) {
       return produtoDAO.readForProd(tipo, desc);
    }
    
    public Produto readForPk(long pk) {
        Produto p = produtoDAO.readForPk(pk);
        if(p == null) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
            return null;
        }
        return p;
    }
}
