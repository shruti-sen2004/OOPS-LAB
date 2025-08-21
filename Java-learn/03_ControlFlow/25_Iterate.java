public class Iterate {
  public static void main(String[] args) {
    // int a = 5;       // initialization
    // while (a < 10) { // condition check
    //   System.out.println(a);
    //   a++; // increment
    // }

    // for(int i = 0; i < 5; i++) {
    //   System.out.println(i);
    // }

    // int c = 5;
    // do {
    //   System.out.println(c);
    //   c++;
    // } while (c < 10);

    // int[] arr = new int[]{1, 2, 3, 4, 5};
    // for (int i = 0; i < arr.length; i++) {
    //   System.out.println(arr[i]);
    // }

    // for (int i : arr) {
    //   System.out.println(i);
    // }

    int a =5;
    while(a != 10) {
        a++;
      if (a == 8) {
        continue;
      }
      
      System.out.println(a);
      
    }
  }
}
