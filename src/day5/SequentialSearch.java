package day5;

import java.util.ArrayList;

public class SequentialSearch {

    public static int searchFunc(ArrayList<Integer> dataList, Integer searchItem) {
        for(int i = 0; i < dataList.size(); i++) {
            if(dataList.get(i) == searchItem) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            testData.add((int)(Math.random()*100));
        }

        testData.forEach(System.out::println);

        int i = searchFunc(testData, 30);
        System.out.println("i = " + i);
    }
}
