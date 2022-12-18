package com.br.avaliacao.Vendas.repository;

import com.br.avaliacao.Vendas.entity.Venda;
import com.br.avaliacao.Vendas.entity.VendaCount;
import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
    @Query(nativeQuery = true)
    VendaCount findVendaCountByPeriodo(Date dataIni, Date dataFim)  ;

    //@Query(value = "select vendedo_id,vendedor_nome,data_venda,sum(valor),count(*)from venda group by vendedo_id,vendedor_nome,data_venda",nativeQuery = true)
    //List<VendaCount> listaCount();


}
