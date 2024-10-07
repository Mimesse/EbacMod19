package Annotation;

public @interface Tarefa {
    String value();

    String [] bairros ();

    long numeroApartamento();
    double valores() default 10f;
}
