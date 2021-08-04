package ru.gb;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException(int x, int y) {
        super(String.format("Размер массива[%d][%d], вместо [4][4]", x, y));
    }
}
