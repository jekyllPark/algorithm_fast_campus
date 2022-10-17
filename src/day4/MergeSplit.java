package day4;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSplit {
    public void splitFunc(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return;
        }
        int medium = dataList.size() / 2;
        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        leftArr = new ArrayList<Integer>(dataList.subList(0, medium));
        rightArr = new ArrayList<Integer>(dataList.subList(medium, dataList.size()));

        System.out.println(leftArr);
        System.out.println(rightArr);
    }

    public static void main(String[] args) {
        MergeSplit mergeSplit = new MergeSplit();
        mergeSplit.splitFunc(new ArrayList<>(Arrays.asList(4, 1, 2, 3, 5)));
    }
}
