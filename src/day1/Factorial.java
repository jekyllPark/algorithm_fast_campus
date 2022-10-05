package day1;

public class Factorial {
    public int factorialFunc(int n) {
        int fac = 1;
        for (int index = 2; index < n + 1; index++) {
            fac = fac * index;
        }
        return fac;
    }

    public int factorialFunc2(int n) {
        if (n > 1) {
            return n * factorialFunc2(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println("obj = " + obj.factorialFunc(2));
        System.out.println("obj.factorialFunc2(5) = " + obj.factorialFunc2(5));
    }
}
