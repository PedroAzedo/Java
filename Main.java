import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Musica minhaMusica = new Musica();
        //ficha tecnica
        System.out.println("digite o nome da musica que deseja adicionar: ");
        minhaMusica.nomeMusica = scanner.nextLine();
        System.out.println("digite o nome da fera que escreveu essa bomba: ");
        minhaMusica.nome = scanner.nextLine();
        System.out.println("digite o ano que foi lançado: ");
        minhaMusica.anoDeLancamento = scanner.nextInt();
        System.out.println("digite a duração: ");
        minhaMusica.duracao = scanner.nextDouble();
        //--------------------------------------------------------------------------
        //exibição da ficha
        minhaMusica.exibirFichaTecnica();
        //avaliação
        System.out.println("quantas vezes voce gostaria de avaliar essa musica?");
        minhaMusica.totalDeAvaliacao = scanner.nextInt();
        for (int i = 0; i<minhaMusica.totalDeAvaliacao; i++){
            System.out.println("digite a nota para a musica: ");
            minhaMusica.avalia(scanner.nextDouble());
        }

        //exibir avaliação
        System.out.println("total de notas: " + minhaMusica.totalDeAvaliacao);
        System.out.println("soma das avaliações: " + minhaMusica.somadasavaliacoes);
        System.out.println("Media das notas: " + minhaMusica.pegaMedia());

    }
}













