package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class OVDAO {
    public boolean adicionarOrdemVenda(OrdemVenda ov) {
        String sql = "INSERT into tbvendas (numOrdemVenda, condPag, dataEmissao,"
                + " valorTotal, qntdTotal) VALUES (?,?,?,?,?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setLong(1, ov.getNumOV());
            stmt.setString(2, ov.getCondPag());
            stmt.setDate(3, new java.sql.Date(ov.getDataEmissao()
                    .getTime()));
            stmt.setDouble(4,ov.getValorTotal());
            stmt.setDouble(5, ov.getQntdTotal());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, 
                    "Ordem de Venda: " + ov.getNumOV() 
                            + " inserido com sucesso!");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }

        return false;
    }
    
    public boolean excluirOrdemVenda(Long numOV) {
        String sql = "DELETE FROM tbvendas WHERE pkidvenda = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);         
            stmt.setLong(1, numOV);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, 
                    "N° de Ordem de venda excluído com sucesso!");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }

        return false;
    }
}
