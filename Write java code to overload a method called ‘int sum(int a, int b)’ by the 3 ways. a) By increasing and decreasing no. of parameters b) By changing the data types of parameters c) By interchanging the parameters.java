public class Overloading {

    // Original method with two integer parameters
    public int sum(int a, int b) {
        return a + b;
    }

    // Overloaded method with one integer parameter
    public int sum(int a) {
        return a + a;
    }

    // Overloaded method with three integer parameters
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    public double sum(double a, double b) {
        return a + b;
    }

    // Overloaded method with two float parameters
    public float sum(float a, float b) {
        return a + b;
    }

    // Overloaded method with two parameters: one int and one double
    public double sum(int a, double b) {
        return a + b;
    }

    // Overloaded method with two parameters: one double and one int (interchanged)
    public double sum(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        // Testing the overloaded methods
        System.out.println("Sum of 2 and 3 (int): " + obj.sum(2, 3));
        System.out.println("Sum of 4 (int): " + obj.sum(4));
        System.out.println("Sum of 1, 2, and 3 (int): " + obj.sum(1, 2, 3));
        System.out.println("Sum of 2.5 and 3.5 (double): " + obj.sum(2.5, 3.5));
        System.out.println("Sum of 1.5f and 2.5f (float): " + obj.sum(1.5f, 2.5f));
        System.out.println("Sum of 2 (int) and 3.5 (double): " + obj.sum(2, 3.5));
        System.out.println("Sum of 3.5 (double) and 2 (int): " + obj.sum(3.5, 2));
    }
}

OUTPUT:

Sum of 2 and 3 (int): 5
Sum of 4 (int): 8
Sum of 1, 2, and 3 (int): 6
Sum of 2.5 and 3.5 (double): 6.0
Sum of 1.5f and 2.5f (float): 4.0
Sum of 2 (int) and 3.5 (double): 5.5
Sum of 3.5 (double) and 2 (int): 5.5
