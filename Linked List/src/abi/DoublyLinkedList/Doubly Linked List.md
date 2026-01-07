Doubly Linked List:

	You can able to move in both direction in the linked list. And last_node.next pointing to Null and Head.previous pointing to null.
	And Each node has 2 pointers 1 for previous node and other for next node.
	
	Program to Create a Node for Doubly Linked List:
	    class Node{
			

	To Add the Element in the first of the Doubly Linked List:
		public Class DLL{

			Node head;
		
			private class Node{
				
				int val;
				Node next;
				Node prev;

				public Node(int val){   //Constructor
					this.val = val;
				}
				
				public Node(int val , Node next , Node prev){   //Constructor
					this.val = val;
					this.next = next;
					this.prev = prev;
				}
			}

			public void insertFirst(int val){ //To Insert the Value at First of the Doubly Linked List
				
				Node node = new Node(val);
				node.next = head;
				node.prev = null;
				if(head != null){
					head.prev = node;
				}
				head = node;
			}
			
			public void display(){
				Node node = head;
				while(node != null){
					System.out.print(node.val + " -> ");
					node = node.next;
				}
			}

		}