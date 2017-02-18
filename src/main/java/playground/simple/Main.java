package playground.simple;

public class Main {
    public static void main(String[] args) {
        A a = (A) getNull();
        System.out.println("ok");
    }

    public static Object getNull() {
        return null;
    }

}

class A {}
