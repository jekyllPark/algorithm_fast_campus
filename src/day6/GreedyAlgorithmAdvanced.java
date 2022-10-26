package day6;

import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgorithmAdvanced {

    /**
     * 내가 이해한 프로세스
     * 1. 무게와 가치를 나눠 보다 가치가 높은 순으로 정렬을 한다.
     * 2. 인자로 받은 제한 용량이 음수가 되기 전까지 objectList의 무게를 감산하며 totalValue의 해당 가치를 가산한다.
     * 3. 다음 배열의 용량이 제한 용량을 초과할 시에 초과하지 않는 수준의 무게만큼만 비율을 구해 해당 비율의 가치만큼 가산한다.
     * */
    public void knapsackFunc(Integer[][] objectList, double capacity) {
        double totalValue = 0.0;
        double fraction = 0.0;

        Arrays.sort(objectList, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return (o2[1] / o2[0]) - (o1[1] / o1[0]);
            }
        });
        
        for (int i = 0; i < objectList.length; i++) {
            if ((capacity - (double) objectList[i][0] > 0)) {
                capacity -= (double) objectList[i][0];
                totalValue += (double) objectList[i][1];
                System.out.println("무게:" + objectList[i][0] + " 가치:" + objectList[i][1]);
            } else {
                fraction = capacity / (double) objectList[i][0];
                System.out.println("fraction = " + fraction);
                totalValue += (double) objectList[i][1] * fraction;
                System.out.println("totalValue = " + totalValue);
                break;
            }
        }
        System.out.println("총 담을 수 있는 가치 : " + totalValue);
    }

    public static void main(String[] args) {
        GreedyAlgorithmAdvanced greedyAlgorithmAdvanced = new GreedyAlgorithmAdvanced();
        Integer[][] objectList = { {20, 10}, {25, 8}, {15, 12}, {30, 5}, {10, 10} };
        greedyAlgorithmAdvanced.knapsackFunc(objectList, 30.0);
    }
}
