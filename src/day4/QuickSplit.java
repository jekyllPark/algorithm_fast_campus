package day4;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSplit {
    public void pivotFunc(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return;
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
        mergedList.addAll(leftList);
        mergedList.addAll(Arrays.asList(pivot));
        mergedList.addAll(rightList);

        System.out.println(leftList);
        System.out.println(pivot);
        System.out.println(rightList);
        System.out.println(mergedList);
    }

    public static void main(String[] args) {
        QuickSplit quickSplit = new QuickSplit();
        quickSplit.pivotFunc(new ArrayList<>(Arrays.asList(4,1,2,5,7)));
    }
}
