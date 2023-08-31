import com.felipe.sremmath.modelos.Filme;
import com.felipe.sremmath.modelos.Serie;
import com.felipe.sremmath.modelos.Titulo;

public class Principal {
    public static void main(String[] args) {

        Titulo meuFilme = new Titulo();

        // os metodos acessores são getters e setters
        // getters são modes de buscar um valor
        // setters colocar valores

        meuFilme.setNome("O Poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(140);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5.5);

        //System.out.println(meuFilme.somaDasAvaliacoes);
        //meuFilme.somaDasAvaliacoes = 10; // não queremos dque uma simples atribuição modifique uma classe

        // Java Doc - documentação do java
        // É MUITO IMPORTANTE SABER O TIPO DE DADO QUE VC TEM !! PARA SABER COMO VC PODE MANIPULALO
        // EXISTEM DIVERSOS METODOS NATIVOS QUE PODEMOS USAR PARA MANIPULAR DADOS
        // PESQUISAR NATIVAMENTE OU ATRAVES DE OUTRAS BIBLIOTECAS


        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacoes());

        System.out.println("A média das avaliações " + meuFilme.pegaMedia());

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(18);
        lost.setMinutosPorEpisodio(50);

        System.out.println("Tempo em minutos para maratonar " + lost.getNome()+ " " + lost.getDuracaoEmMinutos());

        System.out.println();






    }
}
