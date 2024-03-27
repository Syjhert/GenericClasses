package Arithmetic;

public class ArithmeticMain {
    public static void main(String[] args) {
        Arithmetic<Integer, Double> arith = new Arithmetic<>(64, 12.2);

        System.out.println("Add: " + arith.add());
        System.out.println("Subtract: " + arith.subtract());
        System.out.println("Multiply: " + arith.multiply());
        System.out.println("Divide: " + arith.divide());
        System.out.println("GetMin: " + arith.getMin());
        System.out.println("GetMax: " + arith.getMax());
    }
}
