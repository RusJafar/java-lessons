package interview;

//1. Нужно в консоль вывести все буквы из слов в массиве
//2. Расположи буквы в порядке убывания (от Z до A) и выведи в консоль
//3. Удали повторяющиеся символы и выведи в консоль

import java.util.*;

public class interview {
    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        List lst = printResult(strs);
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }

    private static List printResult(String[] strs) {
        List result = new ArrayList();
        for(int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                result.add(chars[j]);
//                System.out.println(chars[j]);
            }
        }
        Collections.sort(result);
        return result;
    }
}



