public class typecast {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // Implicit typecasting (widening)
        System.out.println("Value of b: " + b);

        double c = 20.5;
        int d = (int) c; // Explicit typecasting (narrowing)
        System.out.println("Value of d: " + d);
    }
}