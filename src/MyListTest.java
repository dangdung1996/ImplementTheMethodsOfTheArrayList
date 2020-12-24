public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>(10);
        myList.add(0, 14);
        myList.add(1,24);
        myList.add(2,21);
        myList.get(1);
        System.out.println("Element : "+myList.get(1));
        myList.remove(1);
        System.out.println("Element : "+myList.get(1));
        System.out.println("Element : "+myList.get(2));
    }
}
