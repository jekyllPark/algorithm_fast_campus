package day1;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        int lowest; //해당 인덱스번호
        for (int stand = 0; stand < dataList.size() - 1; stand++) {
            lowest = stand; //가장작다고 가정하고
            for (int index = stand + 1; index < dataList.size(); index++) { //그다음값부터 비교시작
                if (dataList.get(lowest) > dataList.get(index)) {
                    lowest = index;
                }
            }
            Collections.swap(dataList, lowest, stand);
        }
        return dataList;
    }


    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        ArrayList<Integer> testData = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            testData.add((int)(Math.random() * 100));
        }
        selectionSort.sort(testData);
        System.out.println(selectionSort.sort(testData));
    }
}

