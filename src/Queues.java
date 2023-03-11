import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue frutas = new LinkedList();
        frutas.add("manzana");
        frutas.add("durazno");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("durazno");
        Object remover = frutas.remove();

        System.out.println(frutas);
        System.out.println("Dato removio: " + remover);
        System.out.println("Head del arreglo Queue: " + frutas.peek());


    }
}
