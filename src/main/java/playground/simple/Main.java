package playground.simple;

public class Main {
    public static void main(String[] args) {
        final B<Integer> b = new AbstractImplementation().get();
        System.out.println();
    }
}

class InterfaceImpl implements Interface {

    @SuppressWarnings("unchecked")
    public AAndB<Integer> get() {
        //  ^----- Unchecked overriding: return type requires unchecked conversion. Found 'org.example.AAndB<java.lang.integer>', required 'T'.
        final AAndB<Integer> aAndB = new AAndB<Integer>();
        return aAndB;
    }
}

class AbstractImplementation implements Interface {

     @Override
     public <T extends B<Integer> & A> T get() {
         T both = (T) new AAndB();
         return both;
     }
 }

interface Interface {
    <T extends  B<Integer> & A> T get();
}

class AAndB<T> implements A, B<T> {

    public void a() {

    }

    public void b(T t) {

    }
}

interface A {
    void a();
}

interface B<T> {
    void b(T t);
}