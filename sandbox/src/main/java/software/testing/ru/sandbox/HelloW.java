package software.testing.ru.sandbox;

public class HelloW {

    public static void main (String [] args){
        hello("world");
        hello("user");
        hello("Elena");

        Square s = new Square(5);
        System.out.println("The area of a square with a side" + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("The area of a rectangle with sides" + r.a + r.b + " = " + r.area());

    }

    public static void hello(String somebody){
        System.out.println ("Hello, " + somebody + "!");

    }
}

