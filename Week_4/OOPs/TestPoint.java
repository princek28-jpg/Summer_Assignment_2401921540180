package Week_4.OOPs;

class Point {
    private int x, y;  // instance variables

    // Default constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Setter methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Display method to check values
    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class TestPoint {
    public static void main(String[] args) {
        // Using default constructor
        Point p1 = new Point();
        p1.display();

        // Using parameterized constructor
        Point p2 = new Point(3, 4);
        p2.display();

        // Using setters
        p2.setXY(7, 8);
        p2.display();
    }
}

