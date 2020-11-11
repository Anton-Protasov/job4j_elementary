package ru.job4j.array;

public class SwitchArray {

    /*
    Метод swapBorder - меняет местами нулевой элемент и последний элемент в массиве.
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /*
Это метод будет менять местами произвольные элементы
То есть значение ячеек source и dest нужно поменять местами.
    */
    public static int[] swap(int[] array, int source, int dest) {
        int per = array[source];
        array[source] = array[dest];
        array[dest] = per;

        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
