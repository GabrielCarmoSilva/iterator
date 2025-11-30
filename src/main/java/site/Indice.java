package site;

import java.util.Iterator;

public class Indice {

    public static Integer contarProdutosAtivosCategoria(Categoria categoria) {
        int quantidade = 0;
        for (Produto produto : categoria) {
            if (produto.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalProdutosCategoria(Categoria categoria) {
        int quantidade = 0;
        for (Iterator a = categoria.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
