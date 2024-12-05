package Array;


public class Main1 {
    public static void main(String[] args) {
        int[] array = {3, 87, 12, 98, 2, 4, 66};
        System.out.println("Сортировка массива в обратном порядке:");
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
    }
}


