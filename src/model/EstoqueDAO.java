package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EstoqueDAO {

    public static List<Estoque> getEstoque(Estoque codProd) {
        String sql = "SELECT e.pkidestoque,e.tipomovimentacao, tc.fkidproduto,\n"
                + "tc.quantidade,tc.vlrunitario,c.dataemissao FROM tbestoque e\n"
                + "inner join tbitenscompras tc on e.fkiditemcompras = tc.pkiditemcompras\n"
                + "inner join tbcompras c on tc.fkidcompra = c.pkidcompra\n"
                + "where tc.fkidproduto = ? union SELECT e.pkidestoque, e.tipomovimentacao,\n"
                + "tv.fkidproduto, tv.quantidade, tv.vlrunitario, v.dataemissao\n"
                + "FROM tbestoque e inner join tbitensvendas tv on e.fkiditemvendas\n"
                + " = tv.pkiditemvendas inner join tbvendas v on tv.fkidvenda = v.pkidvenda\n"
                + "where tv.fkidproduto = ?;";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Estoque> lista = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, String.valueOf(codProd.getCodProd()));
            stmt.setString(2, String.valueOf(codProd.getCodProd()));
            
            rs = stmt.executeQuery();
            while (rs.next()) {
                codProd.setTipoMov(rs.getString("tipomovimentacao"));
                codProd.setQntd(rs.getInt("quantidade"));
                codProd.setVlrUnit(rs.getDouble("vlrunitario"));
                codProd.setDataMov(rs.getDate("dataemissao"));
                lista.add(codProd);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EstoqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            gerenciador.closeConnection(stmt, rs);
        }

        return lista;
    }
}
