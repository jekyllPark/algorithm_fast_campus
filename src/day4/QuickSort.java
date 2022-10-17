package day4;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }

        int pivot = dataList.get(0);

        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();
        dataList.stream().filter(v -> v != pivot).forEach(v-> {
            if(v > pivot) {
                rightList.add(v);
            } else {
                leftList.add(v);
            }
        });

        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(this.sort(leftList));
        mergedList.addAll(Arrays.asList(pivot));
        mergedList.addAll(this.sort(rightList));

        return mergedList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            testData.add((int)(Math.random()*100));
        }

        QuickSort quickSort = new QuickSort();
        quickSort.sort(testData).forEach(System.out::println);
    }
}
