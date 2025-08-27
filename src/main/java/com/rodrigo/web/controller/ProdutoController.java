package com.rodrigo.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.web.model.Produto;
import com.rodrigo.web.service.ProdutoService;


@RestController
@RequestMapping("produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoService produtoSevice;

    @GetMapping
    public List<Produto> recuperarProdutos() {
        return produtoSevice.recuperarProdutos();
    }

    @PostMapping
    public Produto cadastrarProduto(Produto produto) {
        return produtoSevice.cadastrarProduto(produto);
    }
}
