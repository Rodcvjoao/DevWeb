package com.rodrigo.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rodrigo.web.model.Produto;
import com.rodrigo.web.repository.ProdutoRepository;

@Service
public class ProdutoService{
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> recuperarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto cadastrarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
}