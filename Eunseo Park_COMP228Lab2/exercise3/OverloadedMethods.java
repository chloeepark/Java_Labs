package exercise3;

public class OverloadedMethods {
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    public static void main(String[] args) {
        int result1 = multiply(7, 3);
        double result2 = multiply(6.5, 4.0);
        int result3 = multiply(3, 8, 2);
        
        System.out.println("Result of multiply(int, int): " + result1);
        System.out.println("Result of multiply(double, double): " + result2);
        System.out.println("Result of multiply(int, int, int): " + result3);
    }
}
