public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Vini", 28, 0, 0);

        System.out.println("Nome: " + jogador.getNome());
        System.out.println("Idade: " + jogador.getIdade());
        System.out.println("Pontuação: " + jogador.getPontuacao());
        System.out.println("Número de tentativas: " + jogador.getNumeroTentativas());

    }
}
