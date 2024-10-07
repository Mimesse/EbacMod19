package Anotacao;

@PrimeiraAnotacao(value = "Gustavo", bairros = "Teste", numeroCasa = 10)
public class ClasseComAnotacao {
    @PrimeiraAnotacao(value = "Mimesse", bairros = {"Teste", "Teste1"}, numeroCasa = 20, valores = 100d)
    private String nome;

    @PrimeiraAnotacao(value = "Gustavo", bairros = "Teste", numeroCasa = 10)
    public ClasseComAnotacao () {

    }
}
