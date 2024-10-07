package Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class LeituraDeAnotacoes {

    public static void main(String[] args) {
        executeLeituraAnotacao();
    }

        private static void executeLeituraAnotacao() {
            System.out.println("Anotações");
            LeituraDeAnotacoes prod = new LeituraDeAnotacoes();
            Annotation[] annotations = prod.getClass().getAnnotations();
            for (Annotation an : annotations) {
                System.out.println("Annotation type: " + an.annotationType());
            }

            for (Field field : prod.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(Tarefa.class)) {
                    Tarefa ano = field.getAnnotation(Tarefa.class);
                    System.out.println("Nome da Anotação: " + ano.toString());
                    System.out.println("Valor da Anotação: " + ano.value());
                }
            }

            if (prod.getClass().isAnnotationPresent(Tarefa.class)) {
                Tarefa ano = prod.getClass().getAnnotation(Tarefa.class);
                System.out.println("Nome da Anotação: " + ano.getClass().getName());
                System.out.println("Valor da Anotação: " + ano.value());
            }
    }
}



