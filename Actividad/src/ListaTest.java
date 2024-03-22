import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaTest {
    // Prueba del metodo insertar lista
    @Test
    public void testInsertarLista1(){
        Lista<Integer> lista = new Lista<>();
        lista.insertLast(1);
        lista.insertLast(2);
        lista.insertLast(3);
        Lista<Integer> listaAnexar = new Lista<>();
        listaAnexar.insertLast(2);
        listaAnexar.insertLast(3);
        lista.insertarLista(listaAnexar);
        assertEquals("1 2 3 2 3", lista.toString());
    }
    @Test
    public void testInsertarLista2(){
        Lista<Integer> lista = new Lista<>();
        lista.insertLast(2);
        lista.insertLast(4);
        lista.insertLast(6);
        lista.insertLast(8);
        Lista<Integer> listaAnexar = new Lista<>();
        listaAnexar.insertLast(66);
        listaAnexar.insertLast(3);
        lista.insertarLista(listaAnexar);
        assertEquals("2 4 6 8 66 3", lista.toString());
    }
    @Test
    public void testInsertarLista3(){
        Lista<Integer> lista = new Lista<>();
        lista.insertLast(100);
        lista.insertLast(23);
        Lista<Integer> listaAnexar = new Lista<>();
        listaAnexar.insertLast(2);
        listaAnexar.insertLast(3);
        listaAnexar.insertLast(57);
        listaAnexar.insertLast(390);
        lista.insertarLista(listaAnexar);
        assertEquals("100 23 2 3 57 390", lista.toString());
    }

    // Prueba del metodo sublista
    @Test
    public void testSubLista1() {
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
    public void testSubLista2() {
        Lista<Integer> lista = new Lista<>();
        lista.insertLast(9);
        lista.insertLast(2);
        lista.insertLast(4);
        lista.insertLast(4);
        lista.insertLast(5);

        Lista<Integer> sublista = lista.subLista(0, 4);
        assertEquals("9 2 4 4", sublista.toString());
    }
    @Test
    public void testSubLista3() {
        Lista<Integer> lista = new Lista<>();
        lista.insertLast(2);
        lista.insertLast(3);
        lista.insertLast(6);
        lista.insertLast(4);
        lista.insertLast(5);

        Lista<Integer> sublista = lista.subLista(2, 2);
        assertEquals("6 4", sublista.toString());
    }
    // Prueba del metodo invertir lista
    @Test
    public void testInvertirLista1() {
        Lista<Integer> lista = new Lista<>();
        lista.insertLast(1);
        lista.insertLast(2);
        lista.insertLast(3);
        lista.insertLast(4);
        lista.insertLast(5);

        lista.invertirLista();
        assertEquals("5 4 3 2 1", lista.toString());
    }
    @Test
    public void testInvertirLista2() {
        Lista<Integer> lista = new Lista<>();
        lista.insertLast(3);
        lista.insertLast(88);
        lista.insertLast(3);
        lista.insertLast(4);

        lista.invertirLista();
        assertEquals("4 3 88 3", lista.toString());
    }
    @Test
    public void testInvertirLista3() {
        Lista<Integer> lista = new Lista<>();
        lista.insertLast(9);
        lista.insertLast(5);
        lista.insertLast(1);
        lista.insertLast(32);
        lista.insertLast(2);

        lista.invertirLista();
        assertEquals("2 32 1 5 9", lista.toString());
    }
}