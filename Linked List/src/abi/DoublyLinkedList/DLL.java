package abi.DoublyLinkedList;

public class DLL{

    private Node head; //This used to Initialise the Node Head

    //This used to Insert in the First Place of The Node
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if(head == null){
            head = node;
            node.prev = null;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.next == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after , int val){
        Node p = find(after);

        if(p == null){
            System.out.print("Does not exist.");
            return;
        }

        Node node = new Node(val);

        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }

    }

    //This is Used to Print the Linked List
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " <-> ");
            node = node.next;
        }
        System.out.print("null");
    }

    //This is Used to Create a Linked List Node
    private class Node{
        int val;
        Node next;
        Node prev;

        //This is a Constructor
        public Node(int val){ 
            this.val = val;
        }

        //This is a Constructor
        // public Node(int val , Node next , Node prev){
        //     this.val = val;
        //     this.next = next;
        //     this.prev = prev;
        // }
    }
}