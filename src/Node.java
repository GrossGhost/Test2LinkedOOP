
class Node<T> {

    private T data;
    Node next;
    Node previous;

    Node(T d) {

        data = d;

    }

    void showNode() {

        System.out.print(data + "\t");

    }

}
