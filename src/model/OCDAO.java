/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author S.Lucas
 */
public class OCDAO {
    private String tipoMovim;

    public String getTipoMovim() {
        return tipoMovim;
    }

    public void setTipoMovim(String tipoMovim) {
        this.tipoMovim = tipoMovim;
    }
    
    

    public List<OrdemCompra> getLastId() {
        String sql = "SELECT pkidcompra FROM tbcompras ORDER BY pkidcompra DESC limit 1;";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<OrdemCompra> numOC = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                OrdemCompra oc = new OrdemCompra();
                oc.setNumOC(rs.getLong("pkidcompra"));
                numOC.add(oc);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            gerenciador.closeConnection(stmt, rs);
        }

        return numOC;
    }

    ;
    
    public boolean salvarOC(OrdemCompra o) {
        String sql = "INSERT into tbcompras (dataemissao, condpagamento, vlrtotal, qntitens, fkidfornecedor) VALUES (?,?,?,?,?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setDate(1, new java.sql.Date(o.getDataEmissao().getTime()));
            stmt.setString(2, o.getCondPagamento());
            stmt.setString(3, String.valueOf(o.getValorTotal()));
            stmt.setString(4, String.valueOf(o.getQntdTotal()));
            stmt.setLong(5, o.getPkFornecedor());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }

        o.setNumOC(this.getLastId().get(0).getNumOC());

        JOptionPane.showMessageDialog(null, "Ordem de compra: " + o.getNumOC() + " salva com sucesso!");

        String sql2 = "INSERT into tbestoque (tipomovimentacao, fkiditemcompra, fkiditemvenda) VALUES (?,?,?)";
        PreparedStatement stmt2 = null;

        try {
            stmt2 = con.prepareStatement(sql2);
            stmt2.setString(1, "Entrada");
            stmt2.setString(1, );
            stmt2.setString(1, null);
            stmt2.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }

        String sql3 = "INSERT into tbitenscompras (fkidcompra, fkidproduto, vlrunitario, quantidade, fkidesqtoque) VALUES (?,?,?,?,?)";
        PreparedStatement stmt3 = null;

        for (int i = 0; i < o.getItens().size(); i++) {
            try {
                stmt3 = con.prepareStatement(sql3);
                stmt3.setString(1, String.valueOf(o.getNumOC()));
                stmt3.setString(2, String.valueOf(o.getItens().get(i).getCodigo()));
                stmt3.setString(3, String.valueOf(o.getItens().get(i).getPrecoUnitario()));
                stmt3.setString(4, String.valueOf(o.getItens().get(i).getQuantidade()));
                stmt3.setString(5, String.valueOf(o.getValorTotal()));
                stmt3.executeUpdate();
                return true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
            } finally {
                gerenciador.closeConnection(stmt);
            }
        }

        return false;
    }
}
