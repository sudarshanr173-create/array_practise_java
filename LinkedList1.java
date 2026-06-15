public class LinkedList1 {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add node at end
    public void addfirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");

        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ">-");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int Idx, int data) {
        if (Idx == 0) {
            addfirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while (i < Idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removefirst() {

        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if (size == 1) {
            head = tail = null;
            size = 0;
            return val;
        }

        head = head.next;
        size--;

        return val;
    }

    public int removelast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    public static void main(String args[]) {
        LinkedList1 ll = new LinkedList1();
        ll.print();
        ll.addfirst(1);

        ll.addfirst(2);

        ll.addfirst(4);
        ;
        ll.addfirst(3);

        ll.addfirst(5);
        ll.print();
        ll.addlast(6);
        ll.add(2, 9);
        ll.print();
        ll.removefirst();
        ll.print();
        ll.removelast();
        ll.print();
        // System.out.println(head.data);
        // System.out.println(ll.size);
        // System.out.println(tail.data);
    }
}