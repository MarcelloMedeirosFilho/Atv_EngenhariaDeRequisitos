package com.service.service;

import java.util.*;
import java.util.stream.Collectors;

public class LojaService {

    // 1. Cálculo do Preço Total de um Pedido
    public double calcularPrecoTotalPedido(List<Double> precos, double descontoPercentual) {
        if (precos == null || precos.isEmpty()) {
            return 0.0;
        }
        double total = precos.stream().mapToDouble(Double::doubleValue).sum();
        double desconto = (descontoPercentual / 100) * total;
        return total - desconto;
    }

    // 2. Filtragem de Produtos em Estoque
    public List<Produto> filtrarProdutosEmEstoque(List<Produto> produtos) {
        if (produtos == null) {
            return Collections.emptyList();
        }
        return produtos.stream()
                .filter(Produto::isEmEstoque)
                .collect(Collectors.toList());
    }

    // 3. Validação de Código de Cupom
    public void validarCodigoCupom(String codigo) {
        if (codigo == null || !codigo.matches("^CUPOM-.{6}$")) {
            throw new IllegalArgumentException("Código de cupom inválido!");
        }
    }

    // 4. Classificação de Produtos por Preço
    public List<Double> classificarProdutosPorPreco(List<Double> precos) {
        if (precos == null || precos.isEmpty()) {
            return Collections.emptyList();
        }
        return precos.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    // 5. Envio de Notificação de Produto em Baixa
    public List<String> notificarProdutosEmBaixa(List<Produto> produtos, int limiteEstoque) {
        if (produtos == null) {
            return Collections.emptyList();
        }
        return produtos.stream()
                .filter(produto -> produto.getQuantidadeEstoque() < limiteEstoque)
                .map(Produto::getNome)
                .collect(Collectors.toList());
    }
}
