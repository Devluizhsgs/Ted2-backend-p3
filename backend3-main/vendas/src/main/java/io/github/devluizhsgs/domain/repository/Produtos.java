package io.github.devluizhsgs.domain.repository;

import io.github.devluizhsgs.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
