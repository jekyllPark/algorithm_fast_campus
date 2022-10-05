package day2;

import java.util.ArrayList;

public class Factorial {
    public int factorialFunc(int n) { /** 일반적인 경우 */
        if (n <= 1) {
            return 1;
        } else {
            return n * this.factorialFunc(n - 1);
        }
    }

    public int factorialFunc(ArrayList<Integer> dataList) { /** 리스트 */
        if (dataList.size() <= 0) {
            return 0;
        }
        return dataList.get(0) + this.factorialFunc(new ArrayList<>(dataList.subList(1, dataList.size())));
    }

    public int factorial(int n) { /** 경우의 수 */
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 4;
        }
        return this.factorial(n - 1) + this.factorial(n - 2) + this.factorial(n - 3);
    }


    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int solution = factorial.factorialFunc(5);
        System.out.println("solution = " + solution);

        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dataList.add(i);
        }
        int solution2 = factorial.factorialFunc(dataList);
        System.out.println("solution2 = " + solution2);

        int factorial1 = factorial.factorial(5);
        System.out.println("factorial1 = " + factorial1);
    }

}