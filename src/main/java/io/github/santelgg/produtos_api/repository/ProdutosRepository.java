package io.github.santelgg.produtos_api.repository;

import io.github.santelgg.produtos_api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produto, String> {
}
