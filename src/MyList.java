
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];


    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    //add
    public void add(int index, E element) {
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    //remove
    public E remove(int index) {
        int j = 0;
        for (int i = 0; i < elements.length; i++) {
            if (index != i) {
                elements[j] = elements[i];
                ++j;
            }
        }
        return (E) elements;
    }

    //clone
    public E clone() {
        Object shadowArray[];
        shadowArray = new Object[elements.length];
        for (int i = 0; i < shadowArray.length; i++) {
            shadowArray[i] = elements[i];
        }
        return (E) shadowArray;
    }

    //boolean contains
    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }
    //indexOf
    public int indexOf(E o){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
    
    //boolean add
    public boolean add(E e){
        if (size <= elements.length){
            elements[elements.length] = e;
            return true;
        } else {
            return false;
        }
    }
    //ensureCapacity
    public void ensureCapacity(int miCapacity){

    }
    //E get
    public E get(int i){
        if (i>=size||i<0){
            throw new IndexOutOfBoundsException("index: " + i + ",Size "+ i);
        }
        return (E) elements[i];
    }
    //clear
    public void clear(){
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
    //Print
    public void printList(){
        for(Object e : elements){
            System.out.println(e);
        }
    }
    


}
