package arrays;

public class SuperRozumniyArray<E> {

    private int capacity = 5;
    private E[] array = (E[]) new Object[capacity];

    private int elementsCount = 0;

    SuperRozumniyArray(){

    }

    public void add(E item){
        if (elementsCount < array.length) {
            array[elementsCount] = item;
        } else {
            capacity += 5;
            E[] tempArray = (E[]) new Object[capacity];

            for (int i = 0; i < array.length; i++){
                tempArray[i] = array[i];
            }

            tempArray[elementsCount] = item;
            array = tempArray;
        }

        elementsCount++;
    }

    public E get(int position){
        if (position < elementsCount){
            return array[position];
        } else {
            throw new IndexOutOfBoundsException("Podivis uvajno na position elementu, Rozumniku");
        }
    }
}
