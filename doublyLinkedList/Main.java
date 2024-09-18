package doublyLinkedList;

public class Main {
    public static void main(String args[]) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.printList();

        //appending a new node to the end of the DLL
        myDLL.append(14);

        myDLL.printList();

        //removing the last node from the DLL
        System.out.println(myDLL.removeLastNode().value);

        myDLL.printList();

        //prepending a new node onto the DLL
        myDLL.prepend(21);

        myDLL.printList();

        //removing the First node in a DLL
        System.out.println(myDLL.removeFirstNode().value);

        myDLL.printList();

        //getting the node from a specific index
        myDLL.append(14);
        myDLL.append(21);
        myDLL.append(28);

        myDLL.printList();

        System.out.println(myDLL.get(1).value);
        System.out.println(myDLL.get(2).value);

        //setting the value of a node at a particular index
        myDLL.set(2, 33);
        myDLL.printList();

        //inserting a node at the specified index
        myDLL.insert(1, 22);
        myDLL.printList();

        //removing an element from a given index
        myDLL.removeNode(1);
        myDLL.printList();
    }
}
