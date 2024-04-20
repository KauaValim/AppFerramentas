package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Fornecedor;
import model.FornecedorDAO;

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
    
    public boolean alterarFornecedor(Fornecedor f) {
        if (fornecedorDAO.alterarFornecedor(f)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Fornecedor não cadastrado");
            return false;
        }
    }
    
    public boolean excluirFornecedor(int pkFornecedor) {
        if (fornecedorDAO.excluirFornecedor(pkFornecedor)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Fornecedor não excluído");
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
