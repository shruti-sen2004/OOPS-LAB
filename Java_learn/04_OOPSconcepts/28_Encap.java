import oops.Rectangle;


public class Encap {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        r.draw();
        r.area();
    }
}

// public class Encap {           //HAS-A relationship
//     Rectangle r1;              //An instance of Rectangle class is created in Encap class
//     public void main(String[] args) {
//         r1 = new Rectangle(10,20);
//         r1.draw();
//         r1.area();
//     }
// }