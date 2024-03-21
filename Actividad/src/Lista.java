public class Lista<T> {
    private Nodo<T> head = null;
    private Nodo<T> tail = null;

    public boolean isEmpty() {

        return head == null;
    }

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

    public Lista<T> subLista(int Pos, int tamano) {
        Lista<T> subList = new Lista<>();

        Nodo<T> current = head;
        int currentPosition = 0;

        while (currentPosition < Pos && current != null) {
            current = current.next;
            currentPosition++;
        }
        if (current == null) {
            return subList;
        }
        while (currentPosition < Pos + tamano && current != null) {
            subList.insertLast(current.valor);
            current = current.next;
            currentPosition++;
        }
        return subList;
    }

    public void invertirLista() {
        Nodo<T> temp = null;
        Nodo<T> current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo<T> current = head;
        while (current != null) {
            sb.append(current.valor).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }
}