package com.rodrigo.web;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rodrigo.web.model.Produto;
import com.rodrigo.web.repository.ProdutoRepository;;

@SpringBootApplication
public class WebApplication implements CommandLineRunner{

	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Produto produto = new Produto(
			"abacate.png",
			"Abacate",
			"abacate",
			"1 unidade aprox. 750g",
			true,
			100,
			BigDecimal.valueOf(2.45),
			LocalDate.of(2025, 4, 26),
			"fruta");
		produtoRepository.save(produto);

		produto = new Produto(
        	"abobrinha.png",
        	"Abobrinha",
          	"abobrinha",
          	"1 unidade aprox. 250g",
          	false,
          	500,
          	BigDecimal.valueOf(1.1),
          	LocalDate.of(2025, 5, 22),
         	"legume");
		produtoRepository.save(produto);

		produto = new Produto(
        	"abobora.png",
          	"Abóbora",
          	"abobora",
          	"1 unidade aprox. 1,9kg",
          	true,
          	400,
          	BigDecimal.valueOf(4.7),
          	LocalDate.of(2025, 3, 24),
          	"legume");
		produtoRepository.save(produto);

		produto = new Produto(
    		"acelga.png",
          	"Acelga",
          	"acelga",
          	"1 maço de aprox. 400g",
          	true,
          	120,
          	BigDecimal.valueOf(4.99),
          	LocalDate.of(2025, 3, 12),
          	"verdura");
		produtoRepository.save(produto);

		produto = new Produto(
    		"agriao.png",
        	"Agrião",
        	"agriao",
        	"1 maço de aprox. 200g",
        	true,
        	340,
    		BigDecimal.valueOf(2.5),
        	LocalDate.of(2025, 5, 17),
          	"verdura");
		produtoRepository.save(produto);
	}
}
