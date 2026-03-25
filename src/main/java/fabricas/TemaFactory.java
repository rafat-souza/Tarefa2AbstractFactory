package fabricas;

import produtos.Fundo;
import produtos.Texto;

public interface TemaFactory {
    Fundo criarFundo();
    Texto criarTexto();
}
