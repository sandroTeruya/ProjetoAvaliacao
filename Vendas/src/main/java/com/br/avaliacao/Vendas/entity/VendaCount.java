package com.br.avaliacao.Vendas.entity;

import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.SqlResultSetMapping;
import org.hibernate.annotations.NamedNativeQuery;

import java.util.Date;

public class VendaCount {
    private Integer vendedo_id;
    private String vendedorNome;
    private Date dataaVenda;
    private float somaValor;
    private Integer count;
    private float media;

    public VendaCount(Integer vendedo_id,String vendedorNome,Date dataaVenda, float somaValor, Integer count, float media){
        this.vendedo_id = vendedo_id;
        this.vendedorNome = vendedorNome;
        this.dataaVenda = dataaVenda;
        this.somaValor = somaValor;
        this.count = count;
        this.media = media;
    }

    public Integer getVendedo_id() {
        return vendedo_id;
    }

    public void setVendedo_id(Integer vendedo_id) {
        this.vendedo_id = vendedo_id;
    }

    public String getVendedorNome() {
        return vendedorNome;
    }

    public void setVendedorNome(String vendedorNome) {
        this.vendedorNome = vendedorNome;
    }

    public Date getDataaVenda() {
        return dataaVenda;
    }

    public void setDataaVenda(Date dataaVenda) {
        this.dataaVenda = dataaVenda;
    }

    public float getSomaValor() {
        return somaValor;
    }

    public void setSomaValor(float somaValor) {
        this.somaValor = somaValor;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

}
