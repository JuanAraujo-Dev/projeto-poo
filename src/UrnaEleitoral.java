import java.util.ArrayList;
import java.util.Scanner;

public class UrnaEleitoral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perguntar ao usuário quantos candidatos serão cadastrados
        System.out.print("Quantos candidatos deseja cadastrar? ");
        int numCandidatos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Criar uma lista para armazenar os candidatos
        ArrayList<Candidato> candidatos = new ArrayList<>();

        // Cadastrar os candidatos
        for (int i = 0; i < numCandidatos; i++) {
            System.out.println("Cadastrando candidato " + (i + 1));
            System.out.print("Número do candidato: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("Nome do candidato: ");
            String nome = scanner.nextLine();

            Candidato candidato = new Candidato(numero, nome);
            candidatos.add(candidato);
        }

        // Perguntar ao usuário quantos votos serão lidos em sequência
        System.out.print("Quantos votos serão lidos em sequência? ");
        int numVotos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Ler os números de candidato e incrementar os votos correspondentes
        for (int i = 0; i < numVotos; i++) {
            System.out.print("Digite o número do candidato que recebeu o voto: ");
            int numeroVoto = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            // Encontrar o candidato correspondente
            for (Candidato candidato : candidatos) {
                if (candidato.getNumero() == numeroVoto) {
                    candidato.incrementarVotos();
                    break; // Candidato encontrado, sair do loop
                }
            }
        }

        // Exibir a lista de todos os candidatos e seus votos
        System.out.println("Resultados da eleição:");
        for (Candidato candidato : candidatos) {
            System.out.println(candidato.getNumero() + " - " + candidato.getNome() + " - Votos: " + candidato.getVotos());
        }

        scanner.close();
    }
}
