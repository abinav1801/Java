package abi.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(15);
        list.insertFirst(20);
        list.insertFirst(25);
        list.insertLast(50);
        list.display();
        list.insert(25, 30);
        list.display();
    }
}
