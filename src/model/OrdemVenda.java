package model;

import java.util.Date;

public class OrdemVenda {
    private Long numOrdemVenda;
    private String condPag;
    private Date dataEmissao;
    private double valorTotal;
    private double qntdTotal;

    public OrdemVenda(Long numOrdemVenda, String condPag, Date dataEmissao, double valorTotal, double qntdTotal) {
        this.numOrdemVenda = numOrdemVenda;
        this.condPag = condPag;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
        this.qntdTotal = qntdTotal;
    }

    public Long getNumOrdemVenda() {
        return numOrdemVenda;
    }

    public void setNumOrdemVenda(Long numOrdemVenda) {
        this.numOrdemVenda = numOrdemVenda;
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
}
