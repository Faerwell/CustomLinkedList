public class MyListLinked implements CustomLinkedList{
    Node head;

    @Override
    public MyListLinked insert(MyListLinked list, int data) {
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
    }

    @Override
    public void get(MyListLinked list, Node node) {

    }
}
