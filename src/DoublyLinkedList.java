
class DoublyLinkedList {

    private Node first;
    private Node last;

    DoublyLinkedList() {

        first = null;
        last = null;

    }

    private boolean isEmpty() {

        return first == null;

    }

    <T> void addFirst(T d) {

        Node<T> newNode = new Node<>(d);
        if (isEmpty()) {

            last = newNode;

        } else {

            first.previous = newNode;
        }

        newNode.next = first;
        first = newNode;
    }


    <T> void addLast(T d) {

        Node<T> newNode = new Node<>(d);
        if (isEmpty()) {

            first = newNode;

        } else {

            last.next = newNode;
            newNode.previous = last;

        }
        last = newNode;
    }

    void delFirst() {

        if (first == null) {

            System.out.println("List is Empty!");

        } else if (first.next == null) {

            last = null;

        } else {

            first.next.previous = null;

        }
        if (first != null) {

            first = first.next;

        }
    }

    void delLast() {

        if (first == null) {

            System.out.println("List is Empty!");

        } else if (first.next == null) {

            first = null;

        } else {

            last.previous.next = null;

        }
        if (first != null) {

            last = last.previous;

        }
    }

    void showList() {

        Node current = first;
        if (current == null) {

            System.out.println("List is Empty!");

        } else {

            while (current != null) {

                current.showNode();
                current = current.next;

            }
        }
        System.out.println("\n");
    }
}
