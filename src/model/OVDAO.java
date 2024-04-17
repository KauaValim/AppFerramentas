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
            stmt.setLong(1, ov.getNumOrdemVenda());
            stmt.setString(2, ov.getCondPag());
            stmt.setDate(3, new java.sql.Date(ov.getDataEmissao()
                    .getTime()));
            stmt.setDouble(4,ov.getValorTotal());
            stmt.setDouble(5, ov.getQntdTotal());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, 
                    "Ordem de Venda: " + ov.getNumOrdemVenda() 
                            + " inserido com sucesso!");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }

        return false;
    }
}
