public class Operators {
  public static void main1(String[] args) {        //Different operators
    int a = 10;
    int b = 20;
    // Arithmetic Operators
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(b / a);
    System.out.println(b % a);

    // Unary Operators
    System.out.println(a++);
    System.out.println(++a);
    System.out.println(a--);
    System.out.println(--a);

    a += b; // compound assignment operator
    System.out.println(a);

    int c = 5 + 100 - (30 * 5) / 2; // Operator precedence
    System.out.println(c);

    // Relational Operators
    System.out.println(a == b);
    System.out.println(a != b);
    System.out.println(a > b);
    System.out.println(a < b);
    System.out.println(a >= b);
    System.out.println(a <= b);

    // Logical Operators
    boolean x = true;
    boolean isPassed = false;
    System.out.println(x && isPassed); // AND
    System.out.println(x || isPassed); // OR
    System.out.println(!x); // NOT
  }

  public static void main2(String[] args) {       // Type casting
    long  a = 10;
    int b= (int) a;

    int x = Integer.parseInt("5");
    System.out.println(x);
    // int y = Integer.parseInt("shruti");
    // System.out.println(y);
    float z = Float.parseFloat("5.5");
    System.out.println(z); 
  }

  public static void main3(String[] args) {    // Math class
    int a = 10;
    int b = 20;
    System.out.println(Math.max(a, b));
    System.out.println(Math.min(a, b));

    float percentage = 86.678f;
    System.out.println(Math.round(percentage));
    System.out.println(Math.floor(percentage)); //demotes the value
    System.out.println(Math.ceil(percentage)); //promotes the value

    int x = 144;
    int y =343;
    System.out.println(Math.sqrt(x)); // square root
    System.out.println(Math.cbrt(y)); // cube root
    System.out.println(Math.pow(b, 2)); // square power of x

    double random = Math.random();
    System.out.println(random);
    System.out.println(random * 100); // random number between 0 to 100
  }
}
