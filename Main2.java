package Array;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        double[] array2 = {3.5, 8.7, 10.2, 9.8, 2.3, 1.4, 6, 16};
        System.out.println("Сортировка массива c плавающей точкой по убыванию:");
        System.out.println(Arrays.toString(sortArray(array2)));
    }

    private static double[] sortArray(double[] array2) {
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length - 1; j++) {
                if (array2[j] < array2[j + 1]) {
                    double temp = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = temp;
                }
            }
        }
        return array2;
    }
}

/*
Это черновик с ошибками

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        double[] array2 = {3.5, 8.7, 10.2, 9.8, 2.3, 1.4, 6,16};
        System.out.println("Сортировка массива c плавающей точкой по убыванию:");
        System.out.println(Arrays.toString(sortArray(array2)));
    }
    private static double[] sortArray(double[] array2) {
        for (double i = 0; i < array2.length; i++) {
            for (double j = 0; j < array2.length - 1; j++) {
                if (array2[j] > array2[j + 1.0]) {
                    double temp = array2[j];
                    array2[j] = array2[j + 1.0];
                    array2[j + 1.0] = temp;
                }
            }
        }
        return array2;
    }
}

/*



public class Main2 {
    public static void main(String[] args) {
        double[] array2 = {3.5, 8.7, 10.2, 9.8, 2.3, 1.4, 6,16};
        Arrays.sort(array2);
        for int i = 0; i < array2.length / 2; i++) {
        double temp = array2[i];
        array2[i] = array2[array2.length - i -1];
        array2[array2.length - i - 1] = temp;
        }
        for (double num : array2); {
            System.out.println("Сортировка массива c плавающей точкой по убыванию:");
            System.out.println(num + " ");
        }
    }
}


/*
public class Main2 {
    public static void main(String[] args) {
        float [] floatArray = new float[] {3.5f, 8.7f, 10.2f, 9.8f, 2.3f, 1.4f, 6,16f};
        Arrays.sort(floatArray);
        System.out.println("Сортировка массива c плавающей точкой по возрастанию:");
        for (float temp: floatArray) {
            System.out.println(temp);
        }
    }
}


*/