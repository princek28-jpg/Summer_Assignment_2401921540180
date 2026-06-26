package Week_4.OOPs;

class Outer {
    void display() {
        System.out.println("Display from Outer class");
    }

    // Inner class inside Outer
    class Inner {
        void display() {
            System.out.println("Display from Inner class");
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        // Create object of Outer class
        Outer outer = new Outer();
        outer.display();

        // Create object of Inner class using Outer object
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}

