package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.net.FileNameMap;
import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("John Wick", 2022);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2017);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("lost", 2013);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);


        for (Titulo item: lista) {
            System.out.println(item);
//            Filme filme = (Filme) item;
//            System.out.println("Classificação " + filme.getClassificacao());

            if (item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("paulo");
        buscaPorArtista.add("Adam");
        buscaPorArtista.add("Jaqueline");
        buscaPorArtista.add("Matheus");

        System.out.println("#############################################");

        System.out.println(buscaPorArtista);

        System.out.println("############### Depois do Collections.sort");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println("############### Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("############### Lista de titulos ordenados por ano");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
