package arrays;

public class Main implements AlgorithmSorted {
    public static void main(String[] args) {

        int[] data = {1, 2, 7, 6, 8, 4, 0, 67, 2, 2368, 9298, 11, 47924};

//        AlgorithmSorted.bubbleSort(data);
//        for (int datum : data) {System.out.println(datum);}
//        AlgorithmSorted.SelectionSort(data);
//        for (int datum : data) {System.out.println(datum);}

        AlgorithmSorted.QuickSort(data, 0, data.length-1);
        for (int datum : data) {System.out.println(datum);}


    }
}


class Main2 implements AlgorithmSearch {
    public static void main(String[] args) {

        int[] data = {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7};

    }
}


















