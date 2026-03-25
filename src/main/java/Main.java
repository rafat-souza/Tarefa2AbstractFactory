import cliente.Aplicacao;
import fabricas.TemaClaroFactory;
import fabricas.TemaEscuroFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Iniciando app em modo claro ===");
        Aplicacao appClara = new Aplicacao(new TemaClaroFactory());
        System.out.println(appClara.mostrarInterface());

        System.out.println("=== Mudando app para modo escuro ===");
        Aplicacao appEscura = new Aplicacao(new TemaEscuroFactory());
        System.out.println(appEscura.mostrarInterface());
    }
}
