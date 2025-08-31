package io.github.santelgg.produtos_api.controller;

import io.github.santelgg.produtos_api.model.Produto;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PatchMapping
    public void salvar(Produto produto){
        System.out.println("Produto recebido: " + produto);
    }
}
