public class Musica {
    String nome;
    String nomeMusica;
    int anoDeLancamento;
    double duracao;
    double nota;
    double somadasavaliacoes;
    int totalDeAvaliacao;



    void exibirFichaTecnica(){
        System.out.println("nome da musica: " + nomeMusica);
        System.out.println("nome do artista: " + nome);
        System.out.println("duração: " + duracao);
    }
    void avalia(double nota){
        somadasavaliacoes += nota;

    }
    double pegaMedia(){
        return  somadasavaliacoes / totalDeAvaliacao;
    }
}
