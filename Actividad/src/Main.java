public class Main {
    public static void main(String[] args) {
        Lista<String> l = new Lista<>();
        l.insert("h");
        l.insert("o");
        l.insert("l");
        l.insert("a");
        l.insertLast("!");
        l.print(TraverseDirection.BACKWARD);
        System.out.println();
        l.print(TraverseDirection.FORWARD);
    }
}