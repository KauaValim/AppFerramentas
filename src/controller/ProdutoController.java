/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;
import model.ProdutoDAO;

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
    
    public List<Produto> readForProd(int tipo, String desc) {
       return produtoDAO.readForProd(tipo, desc);
    }
}
