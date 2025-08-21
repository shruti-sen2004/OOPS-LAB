package objectcloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,7,8};
    }

    public Human(Human other) { // when using clone method we donot need this constructor
        this.age = other.age;
        this.name = other.name;
    }

    // public Object clone() throws CloneNotSupportedException { // have to add the throws clause
    //     //this is a shallow copy
    //     return super.clone();
    // }

    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone(); //this is shallow copy

        // let's make it deep copy
        twin.arr = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }


}
