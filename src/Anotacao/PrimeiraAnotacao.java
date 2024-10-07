package Anotacao;

public @interface PrimeiraAnotacao {

    String value();

    String[] bairros ();

    long numeroCasa();

    double valores() default 10f;
}
