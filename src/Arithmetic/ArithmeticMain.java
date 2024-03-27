package Arithmetic;

public class ArithmeticMain {
    public static void main(String[] args) {
        Arithmetic<Integer, Double> arith = new Arithmetic<>(64, 12.2);

        System.out.println("Add:\t\t" + arith.add());
        System.out.println("Subtract:\t" + arith.subtract());
        System.out.println("Multiply:\t" + arith.multiply());
        System.out.println("Divide:\t\t" + arith.divide());
        System.out.println("GetMin:\t\t" + arith.getMin());
        System.out.println("GetMax:\t\t" + arith.getMax());
    }
}
