package com.br.avaliacao.Vendas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NamedNativeQuery;

import javax.lang.model.element.Name;
import java.io.Serializable;
import java.util.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity


public class Venda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "dataVenda", nullable = false)
    private Date dataVenda;
    @Column(name = "valor", nullable = false)
    private float valor;
    @Column(name = "vendedoId", nullable = false)
    private long vendedorId;
    @Column(name = "vendedorNome", nullable = false)
    private String vendedorNome;

    @NamedNativeQuery(name = "VendaCount.findVendaCountByPeriodo",
                      query = "select vendedo_id,vendedor_nome,data_venda,sum(valor)as soma,count(*) as toal from venda " +
                              "group by vendedo_id,vendedor_nome,data_venda where data_venda >= :dataIni and data_venda<= :dataFim",
                      resultSetMapping = "Mapping.VendaCount")

    @SqlResultSetMapping(Name = "Mapping.VendaCount",
            classes = @ConstructorResult(targetClass = VendaCount.class,
            columns = {@ColumnResult(name = "vendedo_id"),
                    @ColumnResult(name = "vendedor_nome"),
                    @ColumnResult(name = "data_venda"),
                    @ColumnResult(name = "soma"),
                    @ColumnResult(name = "toal")}))
}