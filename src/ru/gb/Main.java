package ru.gb;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Подставьте сюда любую букву, слово, boolean, или просто удалите или добавте эллемент и посмотрите, что будет
        String[][] stringArray = {{"1", "5", "9", "8"}, {"74", "1", "54", "1"}, {"58", "104", "99", "500"}, {"0", "99", "106", "109"}};
        try {
            System.out.println("Сумма чисел массива равна: " + toSumArray(stringArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Мы сломали программу, проверьте введённые значения в массив!");
            e.printStackTrace();
        }
        System.out.println("Программа всё ещё работает... до сего момента, спасибо за проверку");
    }

    private static int toSumArray(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                if (stringArray.length != 4 || stringArray[i].length != 4) {
                    throw new MyArraySizeException(i, j);
                } else {
                    try {
                        sum += Integer.parseInt(stringArray[i][j]);
                    } catch (NumberFormatException e) {
                        System.err.println("Внимание! Неверное значение в массиве!");
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        }
        return sum;
    }
}
