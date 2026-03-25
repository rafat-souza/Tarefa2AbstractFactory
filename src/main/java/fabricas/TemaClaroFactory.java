package fabricas;

import produtos.Fundo;
import produtos.FundoTemaClaro;
import produtos.Texto;
import produtos.TextoTemaClaro;

public class TemaClaroFactory implements TemaFactory {
    @Override
    public Fundo criarFundo() {
        return new FundoTemaClaro();
    }

    @Override
    public Texto criarTexto() {
        return new TextoTemaClaro();
    }
}
