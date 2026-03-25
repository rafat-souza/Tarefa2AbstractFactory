package fabricas;

import produtos.Fundo;
import produtos.FundoTemaEscuro;
import produtos.Texto;
import produtos.TextoTemaEscuro;

public class TemaEscuroFactory implements TemaFactory {
    @Override
    public Fundo criarFundo() {
        return new FundoTemaEscuro();
    }

    @Override
    public Texto criarTexto() {
        return new TextoTemaEscuro();
    }
}
