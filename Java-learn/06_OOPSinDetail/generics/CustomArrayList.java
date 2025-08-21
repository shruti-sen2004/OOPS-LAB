package generics;

//import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;  // instance variable does not go out of scope
    private static int DEFAULT_SIZE =10;
    private int size = 0; //also working as index

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int element) {
        if (isFull()) {
            resize();
        }
        data[size++] = element;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2]; // double the size
        for (int i = 0; i < data.length; i++) { // copy the data to temp
            temp[i] = data[i];
        }
        data = temp;
    }
    
    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int element){
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
        CustomArrayList list = new CustomArrayList();
        list.add(45);
        list.add(67);
        list.add(89);

        System.out.println(list);

    }
}
