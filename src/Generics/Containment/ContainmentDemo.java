package Generics.Containment;

public class ContainmentDemo {
    public static void main(String[] args) {
        Integer x[] = {1, 2, 3};
        Containment<Integer> object = new Containment<Integer>(x);

        if (object.contains(2)) {
            System.out.println("2 содержится в object");
        } else {
            System.out.println("2 НЕ содержится в object");
        }

        if (object.contains(5)) {
            System.out.println("5 содержится в object");
        } else {
            System.out.println("5 НЕ содержится в object");
        }
//        if(object.contains(9.25))
//            System.out.println("9.25 не содержится в оЬ");
    }
}
