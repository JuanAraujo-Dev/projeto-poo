public class TesteCandidato {
    public static void main(String[] args) {
        // Criar um candidato com número e nome de sua escolha
        Candidato candidato = new Candidato(1, "João");

        // Exibir o número de votos inicial
        System.out.println("Número de votos iniciais de " + candidato.getNome() + ": " + candidato.getVotos());

        // Incrementar um voto
        candidato.incrementarVotos();

        // Imprimir o número, nome e o total de votos do candidato
        System.out.println("Número do candidato: " + candidato.getNumero());
        System.out.println("Nome do candidato: " + candidato.getNome());
        System.out.println("Total de votos: " + candidato.getVotos());
    }
}
