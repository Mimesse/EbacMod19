package Annotation;

@Tarefa(value = "Gustavo", bairros = "Boa Vista", numeroApartamento = 72, valores = 10)
public class Annotation {
    @Tarefa(value = "Mimessse", bairros = {"Boa Vista", "São Caetano"}, numeroApartamento = 72, valores = 100d)
    private String nome;

    @Tarefa(value = "Gustavo", bairros = "Teste", numeroApartamento = 72)
    public Annotation () {

    }

}
