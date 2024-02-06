
@Tabela(nome = "MinhaTabela")
class Classe {

    private String nome;

    public Classe(String nome) {
        this.nome = nome;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
    }

}
