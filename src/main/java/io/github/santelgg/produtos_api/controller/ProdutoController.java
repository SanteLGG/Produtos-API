package io.github.santelgg.produtos_api.controller;

import io.github.santelgg.produtos_api.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto);
        return produto;
    }
}
