import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    //   int[] marks = new int[5]; // now it is an object so declared as new
    //   int[] marks[0] = 95; marks[1] = 85; marks[2] = 75; marks[3] = 65;
    //   marks[4] = 55;

    int[] marks2 = new int []{95, 85, 75, 65, 55}; // another way to
    //   declare array System.out.println(marks[0]);
    //   System.out.println(marks2[0]);
    //   System.out.println(marks); //cannot print array directly returns
    //   hashcode System.out.println(Arrays.toString(marks)); // to print array
    //   use Arrays.toString
    // }
    Arrays.sort(marks2);
    System.out.println(Arrays.toString(marks2));
    int[][] marks = new int[][] {{50, 55}, {90, 30}};
    System.out.println(marks[0][1]);
    System.out.println(Arrays.deepToString(marks));
  }
}
