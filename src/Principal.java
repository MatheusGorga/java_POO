public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("John Wick");
        meuFilme.setAnoDeLancamento(2017);
        meuFilme.setDuracaoEmMinutos(120);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getAvaliacao() + " " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}
