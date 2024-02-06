import java.lang.annotation.*;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        // Obtendo a anotação e seu valor usando Reflection
        Class<?> classe = Classe.class;
        Annotation anotacao = classe.getAnnotation(Tabela.class);
        String nomeDaTabela = null;

        if (anotacao instanceof Tabela) {
            nomeDaTabela = ((Tabela) anotacao).nome();
        }
        System.out.println("Nome da Tabela: " + nomeDaTabela);
        Classe minhaInstancia = new Classe("Exemplo");
        minhaInstancia.exibirDados();
    }
}