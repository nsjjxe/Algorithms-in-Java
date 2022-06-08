package arrays;

public interface AlgorithmSorted {

//сортування пузирьом (бульбашкою ахахаххаа)
//сортування вбіркою
//швидке сортування


    static void bubbleSort(int[] array) {
        //порівняння двох сусідніх
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    static void SelectionSort(int[] array) {
        //знаходження мінімального і на початок
        for (int i = 0; i < array.length; i++) {
            int index = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    index = j;
                    min = array[j];
                }
            }
            array[index] = array[i];
            array[i] = min;
        }
    }
    static void QuickSort(int[] array, int left, int right) {
        if (left >= right) { //якщо один тільки елемент то вертаємо масив
            return;
        }
        int key = array[left]; // ключ - перший елемент

        int i = left; //масив менше ключа розміщаємо від нього зліва, а більше - справа
        int j = right;
        while (i < j) {
            // j перемещается влево, пока не встретит значение, меньшее, чем ключ
            while (array[j] >= key && i < j) {
                j--;
            }
            // я двигаюсь вправо, пока не встретится значение больше чем ключ
            while (array[i] <= key && i < j) {
                i++;
            }
            // Элементы, на которые указывают i и j, меняются местами
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[left] = array[i];
        array[i] = key;
        QuickSort(array, left, i - 1);
        QuickSort(array, i + 1, right);
    }



}
