package model;

import com.sun.jdi.connect.spi.Connection;
import java.util.List;
import view.FRGerEstoque;

public class EstoqueDAO {

    public List<FRGerEstoque> getEstoque() {
        /*String sql = "SELECT pkidcompra FROM tbcompras ORDER BY pkidcompra DESC limit 1;";

        /*GerenciadorConexao gerenciador = new GerenciadorConexao();
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

        return numOC;*/

    }
}
