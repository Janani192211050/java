class Base {
    // Method to calculate and print the area of a square
    public void area(int a, int b) {
        if (a == b) {
            System.out.println("Area of the square: " + (a * b));
        } else {
            System.out.println("For a square, both sides should be equal.");
        }
    }
}
class Derived extends Base {
    // Overridden method to calculate and print the area of a rectangle
    @Override
    public void area(int a, int b) {
        System.out.println("Area of the rectangle: " + (a * b));
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating an instance of Base class
        Base baseObj = new Base();
        System.out.println("Using Base Class:");
        baseObj.area(4, 4); // Should print area of square
        baseObj.area(4, 5); // Should notify that sides are not equal

        // Creating an instance of Derived class
        Derived derivedObj = new Derived();
        System.out.println("Using Derived Class:");
        derivedObj.area(4, 4); // Should print area of rectangle
        derivedObj.area(4, 5); // Should print area of rectangle
    }
}

OUTPUT:
Using Base Class:
Area of the square: 16
For a square, both sides should be equal.
Using Derived Class:
Area of the rectangle: 16
Area of the rectangle: 20
