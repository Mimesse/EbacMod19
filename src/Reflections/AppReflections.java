package Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppReflections {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Produto.class;
        System.out.println(clazz);

        Produto prod = new Produto();
        Class clazz1 = prod.getClass();
        System.out.println(clazz1);

        try {
            Constructor cons = clazz.getConstructor();
            Produto prod1 = (Produto) cons.newInstance();
            System.out.println(cons);
            System.out.println(prod1);


            Field [] fields = prod1.getClass().getDeclaredFields();
            for (Field field : fields) {
                Class<?> type = field.getType();
                String nome = field.getName();
                System.out.println(type);
                System.out.println(nome);
            }

            Method [] Method = prod1.getClass().getDeclaredMethods();
            for (Method m : Method) {
                Class<?> type = m.getReturnType();
                String nome = m.getName();
                System.out.println(type);
                System.out.println(nome);

                System.out.println("Executando Métodos");
                if (m.getName().startsWith("get")) {
                    System.out.println(m.invoke(prod1));
                } else {
                    for (Class classesType : m.getParameterTypes()) {
                        if (classesType.equals(String.class)) {
                            System.out.println(m.invoke(prod1, "Gustavo"));
                        } else if (classesType.equals(Long.class)) {
                            System.out.println(m.invoke(prod1, 1l));
                        } else {
                            System.out.println(m.invoke(prod1, 2d));
                        }
                    }
                }
            }

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
