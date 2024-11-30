package com.service.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LojaServiceTest {

    private final LojaService lojaService = new LojaService();

    // 1. Teste para calcularPrecoTotalPedido
    @Test
    void testCalcularPrecoTotalPedido() {
        List<Double> precos = Arrays.asList(100.0, 200.0, 50.0);
        assertEquals(315.0, lojaService.calcularPrecoTotalPedido(precos, 10));
        assertEquals(0.0, lojaService.calcularPrecoTotalPedido(Collections.emptyList(), 10));
        assertEquals(0.0, lojaService.calcularPrecoTotalPedido(null, 10));
    }

    // 2. Teste para filtrarProdutosEmEstoque
    @Test
    void testFiltrarProdutosEmEstoque() {
        Produto p1 = new Produto("Produto 1", 10);
        Produto p2 = new Produto("Produto 2", 0);
        Produto p3 = new Produto("Produto 3", 5);

        List<Produto> produtos = Arrays.asList(p1, p2, p3);
        List<Produto> filtrados = lojaService.filtrarProdutosEmEstoque(produtos);

        assertEquals(2, filtrados.size());
        assertTrue(filtrados.contains(p1));
        assertTrue(filtrados.contains(p3));
        assertEquals(Collections.emptyList(), lojaService.filtrarProdutosEmEstoque(null));
    }

    // 3. Teste para validarCodigoCupom
    @Test
    void testValidarCodigoCupom() {
        assertDoesNotThrow(() -> lojaService.validarCodigoCupom("CUPOM-123456"));
        assertThrows(IllegalArgumentException.class, () -> lojaService.validarCodigoCupom("INVALIDO"));
        assertThrows(IllegalArgumentException.class, () -> lojaService.validarCodigoCupom(null));
    }

    // 4. Teste para classificarProdutosPorPreco
    @Test
    void testClassificarProdutosPorPreco() {
        List<Double> precos = Arrays.asList(100.0, 50.0, 200.0);
        List<Double> ordenados = lojaService.classificarProdutosPorPreco(precos);

        assertEquals(Arrays.asList(200.0, 100.0, 50.0), ordenados);
        assertEquals(Collections.emptyList(), lojaService.classificarProdutosPorPreco(null));
        assertEquals(Collections.emptyList(), lojaService.classificarProdutosPorPreco(Collections.emptyList()));
    }

    // 5. Teste para notificarProdutosEmBaixa
    @Test
    void testNotificarProdutosEmBaixa() {
        Produto p1 = new Produto("Produto 1", 10);
        Produto p2 = new Produto("Produto 2", 2);
        Produto p3 = new Produto("Produto 3", 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3);
        List<String> notificacoes = lojaService.notificarProdutosEmBaixa(produtos, 5);

        assertEquals(Arrays.asList("Produto 2", "Produto 3"), notificacoes);
        assertEquals(Collections.emptyList(), lojaService.notificarProdutosEmBaixa(null, 5));
    }
}


