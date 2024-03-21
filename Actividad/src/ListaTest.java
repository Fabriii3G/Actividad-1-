import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaTest {

    @Test
    public void testSubLista() {
        Lista<Integer> lista = new Lista<>();
        lista.insertLast(1);
        lista.insertLast(2);
        lista.insertLast(3);
        lista.insertLast(4);
        lista.insertLast(5);

        Lista<Integer> sublista = lista.subLista(1, 3);
        assertEquals("2 3 4", sublista.toString());
    }

    @Test
    public void testInvertirLista() {
        Lista<Integer> lista = new Lista<>();
        lista.insertLast(1);
        lista.insertLast(2);
        lista.insertLast(3);
        lista.insertLast(4);
        lista.insertLast(5);

        lista.invertirLista();
        assertEquals("5 4 3 2 1", lista.toString());
    }
}