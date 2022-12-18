package com.br.avaliacao.Vendas.http.controller;

import com.br.avaliacao.Vendas.entity.Venda;
import com.br.avaliacao.Vendas.entity.VendaCount;
import com.br.avaliacao.Vendas.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Venda salvar(@RequestBody Venda venda){

        return vendaService.salvar(venda);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<VendaCount> listaCount(){

        return vendaService.listaCount();
    }
}
