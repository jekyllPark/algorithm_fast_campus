package day4;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortA {
    public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }
        int medium = dataList.size() / 2;
        ArrayList<Integer> leftList;
        ArrayList<Integer> rightList;

        leftList = this.mergeSplitFunc(new ArrayList<>(dataList.subList(0, medium)));
        rightList = this.mergeSplitFunc(new ArrayList<>(dataList.subList(medium, dataList.size())));

        return this.mergeFunc(leftList, rightList);
    }

    private ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int leftPoint = 0, rightPoint = 0;
        while (leftList.size() > leftPoint && rightList.size() > rightPoint) {
            if (leftList.get(leftPoint) > rightList.get(rightPoint)) {
                mergedList.add(rightList.get(rightPoint));
                rightPoint += 1;
            } else {
                mergedList.add(leftList.get(leftPoint));
                leftPoint += 1;
            }
        }

        while (leftList.size() > leftPoint) {
            mergedList.add(leftList.get(leftPoint));
            leftPoint += 1;
        }

        while (rightList.size() > rightPoint) {
            mergedList.add(rightList.get(rightPoint));
            rightPoint += 1;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        MergeSortA mergeSortA = new MergeSortA();
        ArrayList<Integer> integers = mergeSortA.mergeSplitFunc(new ArrayList<>(Arrays.asList(4, 1, 2, 3, 5, 6, 10, 32)));
        integers.forEach(System.out::println);
    }
}
