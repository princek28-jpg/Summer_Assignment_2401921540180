package Week_4.OOPs;

// Base class
class Box {
    protected double length, breadth;

    // Constructor
    public Box(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    public double area() {
        return length * breadth;
    }
}

// Derived class
class Box3D extends Box {
    private double height;

    // Constructor
    public Box3D(double l, double b, double h) {
        super(l, b); // call Box constructor
        height = h;
    }

    // Method to calculate volume
    public double volume() {
        return length * breadth * height;
    }
}

// Main class
public class TestBox {
    public static void main(String[] args) {
        Box box = new Box(5, 4);
        System.out.println("Area of Box: " + box.area());

        Box3D box3d = new Box3D(5, 4, 3);
        System.out.println("Volume of Box3D: " + box3d.volume());
    }
}

