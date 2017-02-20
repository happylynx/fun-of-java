package playground.simple;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final A a = new A();
        final Type[] typeArguments = ((ParameterizedType) a.getClass().getGenericInterfaces()[0])
                .getActualTypeArguments();
        System.out.println(Arrays.toString(typeArguments));
    }
}

class A implements B<String> {}

interface B<T> {}
