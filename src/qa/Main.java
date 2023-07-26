package qa;

public class Main {
      public static void main(String[] args) {
          //create some objects
          Circle c = new Circle ("circle1", "red", 0,0, 10);
          Circle c2 = new Circle ("circle2", "blue", 10,10, 5);
          Rectangle r = new Rectangle ("rectangle1", "yellow", 0, 0, 10, 10);
          Rectangle r2 = new Rectangle ("rectangle2", "green", 2, 2, 5, 2);
            //print some objects
          System.out.println(c);
          System.out.println(c2);
            System.out.println("Circle location before move: " + c.getCurrentLocation());
             c.move(10.5, 4.3);
             System.out.println("Circle location after move: " + c.getCurrentLocation());
          System.out.println(r);
          System.out.println(r2);

          System.out.println(c + ", CentrePoint is: " +
                  c.getCentrePoint() + ", Area is: " + c.getArea());
          System.out.println(c2 + ", CentrePoint is: " +
                  c2.getCentrePoint() + ", Area is: " + c2.getArea());
      }
}
