public class Lista<T> {
    private Nodo<T> head = null;
    private Nodo<T> tail = null;

    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Insert at beginning
     */
    public void insert(T element) {
        Nodo<T> nuevo = new Nodo<T>(element);
        if (isEmpty()) {
            head = nuevo;
            tail = head;
        } else {
            nuevo.next = head;
            head.prev = nuevo;
            head = nuevo;
        }
    }

    public void insertLast(T element) {
        if (isEmpty()) {
            this.insert(element);
        } else {
            Nodo<T> nuevo = new Nodo<T>(element);
            tail.next = nuevo;
            nuevo.prev = tail;
            tail = nuevo;
        }
    }

    public void print(TraverseDirection direction) {
        if (direction == TraverseDirection.BACKWARD) {
            Nodo<T> current = tail;
            while (current != null) {
                System.out.print(current.valor + " ");
                current = current.prev;
            }
        } else {
            Nodo<T> current = head;
            while (current != null) {
                System.out.print(current.valor + " ");
                current = current.next;
            }
        }
    }

    public void iterador(){

    }

    public void InsertarLista(){

    }

    public void SubLista(){

    }

    public void InvertirLista(){

    }
}