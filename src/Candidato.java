public class Candidato {
    private int numero;
    private String nome;
    private int votos;

    public Candidato(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.votos = 0;
    }

    // Métodos de acesso para os atributos
    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    // Método para incrementar o número de votos
    public void incrementarVotos() {
        votos++;
    }
}
