
public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.addFirst("o_0");
        list.addFirst(1.2);
        list.addFirst(1);
        list.addLast("Hi!");
        list.addLast(1.83);
        list.addLast(13);

        list.showList();

        list.delFirst();
        list.delLast();

        list.showList();

    }
}
