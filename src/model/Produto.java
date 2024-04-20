package model;

import java.util.Date;
import javax.swing.Icon;

public class Produto {
    private long pkIdProduto;
    private String nome;
    private String categoria;
    private String NCM;
    private Icon imagem;
    private Date dataCadastro;
    private boolean ativo;
    
    public Produto() {}

    public Produto(long pkIdProduto, String nome, Date dataCadastro, boolean ativo) {
        this.pkIdProduto = pkIdProduto;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.ativo = ativo;
    }

    public long getPkIdProduto() {
        return pkIdProduto;
    }

    public void setPkIdProduto(long pkIdProduto) {
        this.pkIdProduto = pkIdProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getNCM() {
        return NCM;
    }

    public void setNCM(String NCM) {
        this.NCM = NCM;
    }
    
    public Icon getImagem() {
        return imagem;
    }

    public void setImagem(Icon imagem) {
        this.imagem = imagem;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String ativoToString() {
        if(ativo == true) {
            return "Ativo";
        } else {
            return "Inativo";
        }
    }
    
}
