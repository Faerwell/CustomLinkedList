import java.util.Random;

public class MyListLinked implements CustomLinkedList{
    Node head;
    Node[] all;

    @Override
    public MyListLinked add(MyListLinked list, int data) {
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;

            while(last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    @Override
    public void show(MyListLinked list) {
        Node currentNode = list.head;
        while(currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.next;
        }
        System.out.println("\n");
    }

    @Override
    public void get(MyListLinked list, Node[] nodes, int data) {
        for (Node node : nodes) {
            if (node.getData() == data) {
                System.out.println(node.getData());
            } else {
                System.out.println("No node founds...");
            }
        }
    }

    @Override
    public void addAll(MyListLinked list, Node[] nodes) {
        for (Node node : nodes) {
            node = new Node(new Random().nextInt(10));
            list.add(list, node.getData());
        }
    }
}
