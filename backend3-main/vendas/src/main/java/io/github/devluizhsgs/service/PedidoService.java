package io.github.devluizhsgs.service;

import io.github.devluizhsgs.domain.entity.Pedido;
import io.github.devluizhsgs.domain.enums.StatusPedido;
import io.github.devluizhsgs.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
