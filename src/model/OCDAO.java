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
    };
    
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: 'INSERT into tbcompras' " + e.getMessage());
        }

        o.setNumOC(this.getLastId().get(0).getNumOC());

        String sql2 = "SELECT pkiditemcompras FROM tbitenscompras ORDER BY pkiditemcompras DESC limit 1;";

        GerenciadorConexao gerenciador2 = new GerenciadorConexao();
        Connection con2 = gerenciador2.getConexao();
        PreparedStatement stmt2 = null;
        ResultSet rs2 = null;
        Long lastPKItensProd = Long.valueOf("0");

        try {
            stmt2 = con2.prepareStatement(sql2);
            rs2 = stmt2.executeQuery();
            rs2.next();
            rs2.getInt(1);
            if (!rs2.wasNull()) {
                lastPKItensProd = rs2.getLong(1);
                lastPKItensProd++;
            }
            /*JOptionPane.showMessageDialog(null, "primeira linha é nula? " + rs2.wasNull());
            JOptionPane.showMessageDialog(null, "o que contém: " + rs2.getLong(1));
            JOptionPane.showMessageDialog(null, "próximo pk: " + lastPKItensProd);*/
        } catch (SQLException ex) {
            lastPKItensProd++;
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql3 = "INSERT into tbitenscompras (fkidcompra, fkidproduto, vlrunitario, quantidade) VALUES (?,?,?,?)";
        GerenciadorConexao gerenciador3 = new GerenciadorConexao();
        Connection con3 = gerenciador3.getConexao();
        PreparedStatement stmt3 = null;

        for (int i = 0; i < o.getItens().size(); i++) {
            try {
                stmt3 = con3.prepareStatement(sql3);
                stmt3.setString(1, String.valueOf(o.getNumOC()));
                o.getItens().get(i).setPkIdItem(lastPKItensProd);
                lastPKItensProd++;
                stmt3.setString(2, String.valueOf(o.getItens().get(i).getCodigo()));
                stmt3.setString(3, String.valueOf(o.getItens().get(i).getPrecoUnitario()));
                stmt3.setString(4, String.valueOf(o.getItens().get(i).getQuantidade()));
                stmt3.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERRO: 'INSERT into tbitenscompras' " + e.getMessage());
            }
        }

        String sql4 = "INSERT into tbestoque (tipomovimentacao, fkiditemcompras) VALUES (?,?)";
        GerenciadorConexao gerenciador4 = new GerenciadorConexao();
        Connection con4 = gerenciador4.getConexao();
        PreparedStatement stmt4 = null;

        try {
            for (int i = 0; i < o.getItens().size(); i++) {
                stmt4 = con4.prepareStatement(sql4);
                stmt4.setString(1, "Entrada");
                stmt4.setString(2, String.valueOf(o.getItens().get(i).getPkIdItem()));
                stmt4.executeUpdate();
            }
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: 'INSERT into tbestoque' " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
            gerenciador2.closeConnection(stmt2, rs2);
            gerenciador3.closeConnection(stmt3);
            gerenciador4.closeConnection(stmt4);
        }
        return false;
    }
}
