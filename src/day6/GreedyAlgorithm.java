package day6;

import java.util.ArrayList;
import java.util.Arrays;

public class GreedyAlgorithm {
    public void coinFunc(Integer price, ArrayList<Integer> coinList) {
        Integer totalCoinCount = 0;
        Integer coinNum = 0;
        ArrayList<Integer> details = new ArrayList<>();

        for (int i = 0; i < coinList.size(); i++) {
            coinNum = price / coinList.get(i);
            totalCoinCount += coinNum;
            price -= coinNum * coinList.get(i);
            details.add(coinNum);
            System.out.println(coinList.get(i) + "원, " + coinNum + "개" );
        }
        System.out.println("총 동전 개수 : " + totalCoinCount);
    }

    public void knapsackFunc() {

    }

    public static void main(String[] args) {
        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
        ArrayList<Integer> coinList = new ArrayList<>(Arrays.asList(500, 100, 50, 10));
        greedyAlgorithm.coinFunc(4720, coinList);

        Integer[][] objectList = {{10, 10}, {15, 12}, {20, 10}, {25, 8}, {30, 5}};
        Integer[] iArray = new Integer[]{1,10,4,3,2};
        Arrays.sort(iArray);
        String s = Arrays.toString(iArray);
        System.out.println("s = " + s);
    }
}
