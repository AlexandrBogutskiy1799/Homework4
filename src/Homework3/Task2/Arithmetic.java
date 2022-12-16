package Homework3.Task2;

public class Arithmetic {
    public static void main(String[] args) {
        int r = 6;
        int g = 33;
        Arithmetic arithmetic = new Arithmetic();
        Adder adder = new Adder();

        adder.check(g,r);
        System.out.println(arithmetic.add(r, g));

    }

    public int add(Integer a, Integer b) {
        return a += b;
    }
}
