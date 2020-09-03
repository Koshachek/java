package Generics.Containment;

public class Containment<T> implements ContainmentImpl<T> {
    T[] arrayRef;

    Containment(T[] o) {
        arrayRef = o;
    }

    @Override
    public boolean contains(T o) {
        for (T x : arrayRef)
            if (x.equals(o)) return true;
        return false;
    }
}
