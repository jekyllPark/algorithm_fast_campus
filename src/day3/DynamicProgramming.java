package day3;

public class DynamicProgramming {
    public int fibonacci(int n) {
        return n <= 1 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int dynamicFunc(int n) {
        Integer[] cache = new Integer[n + 1];
        cache[0] = 0;
        cache[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        DynamicProgramming dynamicProgramming = new DynamicProgramming();
        int fibonacci = dynamicProgramming.fibonacci(10);
        System.out.println("fibonacci = " + fibonacci);

        int i = dynamicProgramming.dynamicFunc(10);
        System.out.println("i = " + i);
    }
}
