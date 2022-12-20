package com.br.avaliacao.Vendas.service;

import com.br.avaliacao.Vendas.entity.Venda;
import com.br.avaliacao.Vendas.entity.VendaCount;
import com.br.avaliacao.Vendas.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;

    public Venda salvar(Venda venda){

        return vendaRepository.save(venda);
    }

    //@GetMapping
    //@ResponseStatus(HttpStatus.OK)
    public List<VendaCount> listaCount(){
        return vendaRepository.VendaCount();
    }
}
