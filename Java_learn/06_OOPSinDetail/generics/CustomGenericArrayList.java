package generics;

//import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private Object[] data;  // instance variable does not go out of scope
    private static int DEFAULT_SIZE =10;
    private int size = 0; //also working as index

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T element) {
        if (isFull()) {
            resize();
        }
        data[size++] = element;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2]; // double the size
        for (int i = 0; i < data.length; i++) { // copy the data to temp
            temp[i] = data[i];
        }
        data = temp;
    }
    
    public T remove() {
        T removed = (T)data[--size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T element){
        data[index] = element;
    }

    public String toString(){
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size+ "}";
    }
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        // list.add(45);
        // list.remove(0);
        // list.get(0);
        // list.set(1,6739);
        // list.size();
        CustomGenericArrayList<Integer> list2 = new CustomGenericArrayList<>();
        for (int i = 0; i < 14; i++) {
            list2.add(i * 2);
        }

        System.out.println(list2);

    }
}
