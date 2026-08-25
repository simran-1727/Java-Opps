public class OperationExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        int leftShift = a << 2;   // 10 * 2^2 = 40
        int rightShift = a >> 1; // 10 / 2 = 5

        System.out.println("Left shift: " + leftShift);
        System.out.println("Right shift: " + rightShift);

        String ternaryResult = (a > b) ? "a is greater than b" : "a is not greater than b";
        System.out.println("Ternary result: " + ternaryResult);
    }
}