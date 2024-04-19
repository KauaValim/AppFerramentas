package model;

import java.util.Date;

public class ItensOC extends OrdemCompra{
    private Long pkIdItem;
    private Long codigo;
    private String nome;
    private double precoUnitario;
    private int quantidade;
    
    public ItensOC() {}

    public ItensOC(Long pkIdItem, Long codigo, String nome, double precoUnitario, int quantidade) {
        this.pkIdItem = pkIdItem;
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public ItensOC(Long pkIdItem, Long codigo, String nome, double precoUnitario, int quantidade, Long numOC, Date dataEmissao, String condPagamento, double valorTotal, int qntdTotal, Long pkFornecedor) {
        super(numOC, dataEmissao, condPagamento, valorTotal, qntdTotal, pkFornecedor);
        this.pkIdItem = pkIdItem;
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public Long getPkIdItem() {
        return pkIdItem;
    }

    public void setPkIdItem(Long pkIdItem) {
        this.pkIdItem = pkIdItem;
    }
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    } 
}
