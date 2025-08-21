package objectcloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Shruti = new Human(21, "Shruti");
        // Human twin = new Human(Shruti);

        Human twin = (Human) Shruti.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(Shruti.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}
