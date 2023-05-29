package io.github.devluizhsgs.domain.repository;

import io.github.devluizhsgs.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
