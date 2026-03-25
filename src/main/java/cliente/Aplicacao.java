package cliente;

import fabricas.TemaFactory;
import produtos.Fundo;
import produtos.Texto;

public class Aplicacao {
    private Fundo fundo;
    private Texto texto;

    public Aplicacao(TemaFactory factory) {
        this.fundo = factory.criarFundo();
        this.texto = factory.criarTexto();
    }

    public String mostrarInterface() {
        return "interface carregada com: " + fundo.renderizar() + " e " + texto.renderizar();
    }
}
