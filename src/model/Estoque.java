package model;

import java.util.Date;
import java.util.List;

public class Estoque {
    private Long codProd;
    private String nomeProd;
    private String tipoMov;
    private int qntd;
    private double vlrUnit;
    private Date dataMov;

    public Estoque() {}

    public Estoque(Long codProd, String nomeProd, String tipoMov, int qntd, double vlrUnit, Date dataMov) {
        this.codProd = codProd;
        this.nomeProd = nomeProd;
        this.tipoMov = tipoMov;
        this.qntd = qntd;
        this.vlrUnit = vlrUnit;
        this.dataMov = dataMov;
    }

    public Long getCodProd() {
        return codProd;
    }

    public void setCodProd(Long codProd) {
        this.codProd = codProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public double getVlrUnit() {
        return vlrUnit;
    }

    public void setVlrUnit(double vlrUnit) {
        this.vlrUnit = vlrUnit;
    }

    public Date getDataMov() {
        return dataMov;
    }

    public void setDataMov(Date dataMov) {
        this.dataMov = dataMov;
    }
}
