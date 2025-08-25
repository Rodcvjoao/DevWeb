package com.rodrigo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.web.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
