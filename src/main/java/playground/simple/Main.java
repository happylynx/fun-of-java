package playground.simple;

public class Main {
    public static void main(String[] args) {
        System.out.println(new A());
    }

    private static class A {
        @Override
        public String toString(A this) {
            return "A{}";
        }
    }
}
