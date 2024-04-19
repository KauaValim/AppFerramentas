package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.FRGerEstoque;

public class EstoqueDAO {

     public static List<FRGerEstoque> getEstoque() {
        String sqlCompra = "SELECT tbcompras FROM tbcompras ORDER BY pkidcompra DESC LIMIT 1;";
        String sqlVenda = "SELECT tbvendas FROM tbvendas ORDER BY pkidvenda DESC LIMIT 1;";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
         List<FRGerEstoque> estoque = new ArrayList<>();

        try {
            
            stmt = con.prepareStatement(sqlCompra);
            rs = stmt.executeQuery();
            while (rs.next()) {
                OrdemCompra ordemCompra = new OrdemCompra();
                ordemCompra.setNumOC(rs.getLong("pkidcompra"));
                FRGerEstoque frGerEstoque = new FRGerEstoque();
                frGerEstoque.setOrdem(ordemCompra);
                estoque.add(frGerEstoque);
            }

            stmt = con.prepareStatement(sqlVenda);
            rs = stmt.executeQuery();
            while (rs.next()) {
                OrdemVenda ordemVenda = new OrdemVenda();
                ordemVenda.setNumOV(rs.getLong("pkidvenda"));
                estoque.add(ordemVenda);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EstoqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            gerenciador.closeConnection(stmt, rs);
        }

        return estoque;
    }
}