public class Runner {
    public static void main(String[] args) {
        MyListLinked myList = new MyListLinked();
        int[] data = new int[]{1, 2, 3, 4 ,5};
        myList.insert(myList, 1);
        myList.insert(myList, 2);
        myList.show(myList);
        myList.get(myList, new Node(1));
    }
}
