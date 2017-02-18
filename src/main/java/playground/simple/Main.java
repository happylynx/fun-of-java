package playground.simple;

public class Main {
    public static void main(String[] args) {
        A a = (A) getNull(); // fails during compilation
        System.out.println("ok");
    }

    public static B getNull() {
        return null;
    }

}

class A {}

class B {}
