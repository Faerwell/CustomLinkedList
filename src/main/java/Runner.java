import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        MyListLinked myList = new MyListLinked();

        myList.add(myList, 1);
        myList.add(myList, 2);
        myList.show(myList);

        Node[] nodes = new Node[5];
        myList.addAll(myList, nodes);
        myList.show(myList);
    }
}
