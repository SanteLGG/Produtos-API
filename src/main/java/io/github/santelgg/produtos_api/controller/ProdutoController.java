package io.github.santelgg.produtos_api.controller;

import io.github.santelgg.produtos_api.model.Produto;
import io.github.santelgg.produtos_api.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutosRepository produtosRepository;

    @PostMapping("/cadastro")//cadastrar produtos
    public Produto salvarProduto(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtosRepository.save(produto);
        return produto;
    }

    //Construtor para o produtosRepository
    public ProdutoController(ProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }
}
