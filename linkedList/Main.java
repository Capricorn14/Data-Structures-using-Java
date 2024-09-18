package linkedList;
public class Main {
    public static void main(String args[]) {
        LinkedList myLinkedList = new LinkedList(4);
        
        // myLinkedList.getHead();
        // myLinkedList.getTail();
        // myLinkedList.getLength();
        // myLinkedList.printList();

        // myLinkedList.append(7);
        // myLinkedList.printList();

        // System.out.println(myLinkedList.removeLast().value);
        // myLinkedList.prepend(10);
        // myLinkedList.printList();

        // System.out.println(myLinkedList.removeFirst().value);

        //for set method
        myLinkedList.append(11);
        myLinkedList.append(3);
        myLinkedList.append(54);
        myLinkedList.append(21);

        // myLinkedList.printList();

        myLinkedList.set(2, 5);

        // myLinkedList.printList();


        //insert method
        // myLinkedList.insert(3, 44);

        // myLinkedList.printList();

        // //remove an item from a specific index
        // myLinkedList.remove(4);
        // myLinkedList.printList();

        //reverse a LinkedList 
        myLinkedList.reverse();
        myLinkedList.printList();
        
    }
}
