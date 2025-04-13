package lisson3;

/**
 * Домашнее задание:
 * Есть массив цифр: {3,5,8,3,55,4,1,65,36,98}
 * 1) Вывести на консоль через ячейку
 * 2) Вывести на консоль массив с обратной стороны
 * 3) * Вывести на консоль те числа, которые содержат символ 5
 * <p>
 * Есть текст "Я буду учиться лучше"
 * 4) Напечатать на консоль каждое слово в отдельной строке
 * 5) Напечатать на консоль каждое слово в обратном порядке
 */

public class HomeWork {
    public static void main(String[] args) {
        printSplitText();
    }

    public static void printArray() {
        int[] nums = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }

    public static void printArrayWithFive() {
        int[] nums = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};

        for (int i = nums.length - 1; i >= 0; i--) {
            String currentNum = nums[i] + "";
            if (currentNum.contains("5")) {
                System.out.println(currentNum);
            }

        }
    }

    public static void printSplitText() {
        String text = "Я буду учиться лучше";
        String[] splitText = text.split(" ");
        for (int i = splitText.length - 1; i >= 0; i--) {
            System.out.println(new StringBuilder(splitText[i]).reverse());

        }
    }


}