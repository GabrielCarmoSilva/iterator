package site;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndiceTest {

    @Test
    void deveContarProdutosAtivosCategoria() {
        Categoria categoria = new Categoria(
                new Produto("Televisão", true),
                new Produto("Air Fryer", true),
                new Produto("Aparelho de Som", false),
                new Produto("Liquidificador", true)
        );
        assertEquals(3, Indice.contarProdutosAtivosCategoria(categoria));
    }

    @Test
    void deveContarTotalProdutosCategoria() {
        Categoria categoria = new Categoria(
                new Produto("Televisão", true),
                new Produto("Air Fryer", true),
                new Produto("Aparelho de Som", false),
                new Produto("Liquidificador", true)
        );
        assertEquals(4, Indice.contarTotalProdutosCategoria(categoria));
    }
}
