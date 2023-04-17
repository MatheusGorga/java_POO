import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("John Wick", 2022);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(2);


        Filme outroFilme = new Filme("Avatar", 2017);
        outroFilme.setDuracaoEmMinutos(220);

        Serie lost = new Serie("lost", 2013);
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

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(120);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println(listaDeFilmes.size());

        System.out.println(listaDeFilmes);



    }
}
