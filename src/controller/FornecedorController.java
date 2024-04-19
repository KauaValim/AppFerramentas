/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Fornecedor;
import model.FornecedorDAO;
import model.Usuario;

/**
 *
 * @author S.Lucas
 */
public class FornecedorController {
    private FornecedorDAO fornecedorDAO;
    
    public FornecedorController() {
        fornecedorDAO = new FornecedorDAO();
    }
    
    
    public boolean adicionarFornecedor(Fornecedor f) {
        if (fornecedorDAO.adicionarFornecedor(f)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Fornecedor não cadastrado");
            return false;
        }
    }
    
    public List<Fornecedor> readForForn(int tipo, String desc) {
       return fornecedorDAO.readForForn(tipo, desc);
    }
    
    public Fornecedor readForPk(long pk) {
        Fornecedor forn = fornecedorDAO.readForPk(pk);
        if(forn == null) {
            JOptionPane.showMessageDialog(null, "Fornecedor não encontrado");
            return null;
        }
        return forn;
    }
}
