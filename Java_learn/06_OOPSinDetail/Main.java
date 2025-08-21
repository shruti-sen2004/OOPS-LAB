class Student {
  int rno ;
  String name;
  float marks;
}

public class Main {
    public static void main(String[] args) {
      Student kunal = new Student();

      kunal.rno = 1;
      kunal.name = "Kunal Singh";
      kunal.marks = 99.99f;

      System.out.println(kunal.rno);
      System.out.println(kunal.name);
      System.out.println(kunal.marks);
    }
}