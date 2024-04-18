package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdemVenda {
    private Long numOV;
    private String condPag;
    private Date dataEmissao;
    private double valorTotal;
    private double qntdTotal;
    List<ItensOV> itens = new ArrayList<>();
    
    public OrdemVenda(){}

    public OrdemVenda(Long numOV, String condPag, Date dataEmissao, double valorTotal, double qntdTotal) {
        this.numOV = numOV;
        this.condPag = condPag;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
        this.qntdTotal = qntdTotal;
    }

    public Long getNumOV() {
        return numOV;
    }

    public void setNumOV(Long numOV) {
        this.numOV = numOV;
    }

    public String getCondPag() {
        return condPag;
    }

    public void setCondPag(String condPag) {
        this.condPag = condPag;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getQntdTotal() {
        return qntdTotal;
    }

    public void setQntdTotal(double qntdTotal) {
        this.qntdTotal = qntdTotal;
    }

    public List<ItensOV> getItens() {
        return itens;
    }

    public void setItens(List<ItensOV> itens) {
        this.itens = itens;
    }
    
}
