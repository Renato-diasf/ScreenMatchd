import br.com.diaslitz.screenshot.calculos.FiltroRecomendacao;
import br.com.diaslitz.screenshot.models.Episodio;
import br.com.diaslitz.screenshot.models.Filme;
import br.com.diaslitz.screenshot.models.Serie;
import br.com.diaslitz.screenshot.calculos.Calculadora;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Homem-Aranha");
        meuFilme.setAnoDeLancamento(2005);
        meuFilme.setDuracao(124);

        meuFilme.exibeFilme();

        meuFilme.daLike(10);
        meuFilme.daLike(7);
        meuFilme.daLike(8);
        System.out.println("Existem " + meuFilme.getTotalDeAvaliacoes() + " avaliações");

        System.out.printf("A média de Avaliações é %.2f\n", meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Breaking Bad");
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setDuracaoPorEpisodio(45);
        System.out.println(serie.getDuracao());

        Calculadora calculadora = new Calculadora();
        calculadora.inclui(meuFilme);
        calculadora.inclui(serie);
        System.out.println("Você precisa de " + calculadora.getTempoTotal() + " minutos para maratonar essa playlist!");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setSerie(serie);
        episodio.setNome("A mosca");
        episodio.setNumero(8);
        episodio.setNumeroDeVisualizacoes(200);

        filtro.filtra(episodio);
    }
}