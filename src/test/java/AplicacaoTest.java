import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import fabricas.TemaFactory;
import fabricas.TemaClaroFactory;
import fabricas.TemaEscuroFactory;
import produtos.*;

public class AplicacaoTest {

    @Test
    public void testeTemaClaroGeraComponentesCorretos() {
        TemaFactory fabricaClara = new TemaClaroFactory();

        Fundo fundo = fabricaClara.criarFundo();
        Texto texto = fabricaClara.criarTexto();

        assertTrue(fundo instanceof FundoTemaClaro, "O fundo deveria ser FundoTemaClaro");
        assertTrue(texto instanceof TextoTemaClaro, "O texto deveria ser TextoTemaClaro");

        assertEquals("Fundo Branco", fundo.renderizar());
        assertEquals("Letras Cinza Escuro", texto.renderizar());
    }

    @Test
    public void testeTemaEscuroGeraComponentesCorretos() {
        TemaFactory fabricaEscura = new TemaEscuroFactory();

        Fundo fundo = fabricaEscura.criarFundo();
        Texto texto = fabricaEscura.criarTexto();

        assertTrue(fundo instanceof FundoTemaEscuro, "O fundo deveria ser FundoTemaEscuro");
        assertTrue(texto instanceof TextoTemaEscuro, "O texto deveria ser TextoTemaEscuro");

        assertEquals("Fundo Preto", fundo.renderizar());
        assertEquals("Letras Brancas", texto.renderizar());
    }

}