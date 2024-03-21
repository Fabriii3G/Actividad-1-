import org.junit.Test;
public class Main {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        lista.insertLast(1);
        lista.insertLast(2);
        lista.insertLast(3);
        lista.insertLast(4);
        lista.insertLast(5);
        Lista<Integer> sublista = lista.subLista(1, 3);
        lista.print(TraverseDirection.FORWARD);
        System.out.println();
        lista.invertirLista();
        lista.print(TraverseDirection.FORWARD);
        System.out.println();
        sublista.print(TraverseDirection.FORWARD);
        lista.toString();
        System.out.println();
        lista.print(TraverseDirection.FORWARD);
    }
}