import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("John Wick");
        meuFilme.setAnoDeLancamento(2017);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(2);


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2017);
        outroFilme.setDuracaoEmMinutos(220);

        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(20);
        lost.setMinutosPorEpisodio(50);




        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Tempo total do filme = " + calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(90);
        filtro.filtra(episodio);
    }
}
