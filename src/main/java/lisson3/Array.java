package lisson3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        task2();
//        task3();
//        task4();
        task5();
    }

    public static void task() {
        String[] array = new String[]{"Hello"};
    }

    public static void task2() {
        int[] array = {1, 2, 5, 4, 78, 90};

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void task3() {
        char[] array1 = {'g', 'f', 'r', 'w', 'q', 'v', 'u'};
        char[] array2 = {'3', 4, 'w'};

        char[] array = new char[array1.length + array2.length];


        for (int i = 0; i < array.length; i++) {
            if (i < array1.length) {
                array[i] = array1[i];
            } else {
                array[i] = array2[i - array1.length];
            }
        }

        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }

    public static void task4() {
        int[] numbers = {23,45,65,78,9,4,32,65,87,97,4,32,6,3};

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 3 == 0 && i != numbers.length -1) {
                System.out.println(numbers[i + 1]);
            }
        }
    }

    public static void task5() {
        String text = "HEllo";
        char[] charArray = text.toCharArray();
        Arrays.sort(charArray, 0, 2 );
        for (int i =  0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }

}
